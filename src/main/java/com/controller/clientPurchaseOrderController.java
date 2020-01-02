package com.controller;

import com.dao.IOrderGoods;
import com.domain.*;
import com.service.*;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping("/clientPurchaseOrder")
public class clientPurchaseOrderController {

    @Autowired
    private IClientPurchaseOrderService iClientPurchaseOrderService;

    @Autowired
    private IOrderGoodsService iOrderGoodsService;

    @Autowired
    private IOrderService iOrderService;

    @Autowired
    private IClientPurchaseGoodsService iclientPurchaseGoodsService;

    @Autowired
    private IDispatchOrderService iDispatchOrderService;

    @RequestMapping("/findAll")
    public void  findAll(){
        // 调用service的方法,无论查询成功还是失败，sum都可以有值
        List<Client_Purchase_Order> list =  iClientPurchaseOrderService.findAll();
        HttpSession session   =   ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest().getSession();
        session.setAttribute("allcpOrder",list);
        List<Client_Purchase_Order> list1 = new ArrayList<>();
        List<Client_Purchase_Order> list2 = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getState().equals("已付款")){
                list1.add(list.get(i));
            }
            else list2.add(list.get(i));
        }
        session.setAttribute("yifukuan",list1);
        session.setAttribute("weifukuan",list2);

    }

    @RequestMapping("/confirm")
    public String confirm(HttpServletRequest httpServletRequest){
        String  id = httpServletRequest.getParameter("id");
        HttpSession session   =   ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        // 调用service的方法,修改状态为已付款
        Client_Purchase_Order client_purchase_order = iClientPurchaseOrderService.findOne(Integer.parseInt(id));
        //修改清单状态
        client_purchase_order.setState("已付款");
        iClientPurchaseOrderService.save(client_purchase_order);
        //修改合同状态
        Order order = iOrderService.findOne((int)client_purchase_order.getOrder_id());
        order.setState("执行中");
        System.out.println("修改合同状态");
        System.out.println(order);
        iOrderService.save(order);
//        修改货物状态,并且同时生成发货单
        List<Order_Goods> order_goods = iOrderGoodsService.findOne((int)client_purchase_order.getOrder_id());
        System.out.println(order_goods);
        for (Order_Goods order_good : order_goods) {
            System.out.println("新增dispatch");
            order_good.setState("已付款");
            iOrderGoodsService.save(order_good);
            //        自动生成发货单
            Dispatch_Order dpOrder = new Dispatch_Order();
            dpOrder.setDate(client_purchase_order.getDate());
            dpOrder.setAddress(client_purchase_order.getAddress());
            dpOrder.setState("待执行");
            dpOrder.setSum(order_good.getSum());
            dpOrder.setGoods_name(order_good.getGoods_name());
            dpOrder.setNumber(order_good.getNumber());
            dpOrder.setOrder_id(order_good.getOrder_id());
            dpOrder.setSales_keeper_id(Integer.parseInt(iOrderService.findOne((int) order_good.getOrder_id()).getSalesman_id()));
            dpOrder.setWarehouse_keeper_id(-1);
            dpOrder.setEms_number("0");
            System.out.println(dpOrder);
            iDispatchOrderService.save(dpOrder);
        }
        return "redirect:/order-confirm.jsp";
    }

    @RequestMapping("/findCompanyAllSum")
    public String  findCompanyAllSum(String dateA,String dateB){
        // 调用service的方法,无论查询成功还是失败，sum都可以有值
        int sum = iClientPurchaseOrderService.findCompanyAllSum(dateA,dateB);
        HttpSession session   =   ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest().getSession();
        String msg = "A公司在该段时间内的销售额："+sum+"元";
        session.setAttribute("msg",msg);
        return "redirect:/xiaoshoue.jsp";
    }

    @RequestMapping("/findGoodsAllSum")
    public String findGoodsAllSum(String id){
        int sum = iClientPurchaseOrderService.goodsAllSum(id);
        HttpSession session   =   ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest().getSession();
        String msg = "该商品的销售额为："+sum+"元";
        session.setAttribute("msg",msg);
        return "form-elements";
    }



    //保存采购清单，保存采购清单货物
    @RequestMapping(value ="/save")
    @ResponseBody
    public void save(HttpServletRequest request, HttpServletResponse response) throws IOException {
       HttpSession session   =   ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        // 调用service的方法

        Client_Purchase_Order cpOrder = new Client_Purchase_Order();
        cpOrder.setDate(request.getParameter("date"));
        cpOrder.setAddress(request.getParameter("address"));
        cpOrder.setState("待确认");
        int currentID=1;
        if(iClientPurchaseOrderService.getMaxId()!=null){
            currentID = iClientPurchaseOrderService.getMaxId()+1;
        }
        cpOrder.setId(currentID);
        String[] listGoods = request.getParameterValues("listGood");
        String order_id = request.getParameter("order_id");
        cpOrder.setOrder_id(Integer.parseInt(order_id));
        System.out.println("合同货物：");
        System.out.println(Arrays.toString(listGoods));

        //查找这些商品的具体属性,一个个找，把它添加进清单里面
        List<Client_Purchase_Goods> cpGoods = new ArrayList<>();
        float sum=0;
        for (String s:listGoods){
           Order_Goods order_goods = iClientPurchaseOrderService.findGoods(s,order_id);
           //修改state为已付款
            order_goods.setState("已付款");
            //查询得到某合同货物
            System.out.println("当前货物");
            System.out.println(order_goods);
            iOrderGoodsService.save(order_goods);


           //把该合同货物属性赋给清单货物
           Client_Purchase_Goods client_purchase_goods = new Client_Purchase_Goods();
           //拿货物名字
           client_purchase_goods.setGoods_name(s);
           //合同货物数量
           client_purchase_goods.setNumber(order_goods.getNumber());
           //拿当前最大ID
           client_purchase_goods.setQingdan_id(currentID);
            System.out.println("清单货物");
            System.out.println(client_purchase_goods);
            //保存清单货物
            iclientPurchaseGoodsService.save(client_purchase_goods);
            sum += order_goods.getSum();
           cpGoods.add(client_purchase_goods);
       }

        cpOrder.setListGoods(cpGoods);
        cpOrder.setSum(sum);
        iClientPurchaseOrderService.save(cpOrder);
        System.out.println("save 清单 Success");
        response.sendRedirect("/order-confirm.jsp");
    }

}
