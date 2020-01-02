package com.controller;

import com.dao.IDispatchOrderDao;
import com.dao.IPurchaseOrderDao;
import com.domain.Dispatch_Order;
import com.domain.Goods;
import com.domain.Purchase_Order;
import com.service.IDispatchOrderService;
import com.service.IGoodsService;
import com.service.IPurchaseOrderService;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/dispatch")
public class dispatchOrder {

    @Autowired
    private IDispatchOrderService iDispatchOrderService;

    @Autowired
    private IGoodsService iGoodsService;

    @Autowired
    private IPurchaseOrderService iPurchaseOrderService;

    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    public void findAll(){
        HttpSession session   =   ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        // 调用service的方法
        List<Dispatch_Order> list = iDispatchOrderService.findAll();
        session.setAttribute("alldpPorder",list);
        List<Dispatch_Order> list1 = new ArrayList<>();
        List<Dispatch_Order> list2 = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getState().equals("已确认")){
                list1.add(list.get(i));
            }
            else list2.add(list.get(i));
        }
        session.setAttribute("yiquerenDis",list1);
        System.out.println("dispatch list1");
        System.out.println(list1);
        System.out.println("dispatch list2");
        System.out.println(list2);
        session.setAttribute("daizhixingDis",list2);
        System.out.println("yi");
        System.out.println(session.getAttribute("yiquerenDis"));

    }


    @RequestMapping(value = "/confirm")
    public String confirm(HttpServletRequest httpServletRequest){
        HttpSession session   =   ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        //得到信息
        int  whId = Integer.parseInt(httpServletRequest.getParameter("whId"));
        String  ems_number = httpServletRequest.getParameter("ems_number");
        String id = (String) session.getAttribute("dispatchID");
        //查找该id的发货单
         Dispatch_Order list = iDispatchOrderService.findById(Integer.parseInt(id));
        //首先查看该商品库存，如果发货单小于当前库存则返回信息提示不能生成发货单，提示去增加进货单
         Goods goods = iGoodsService.findByName(list.getGoods_name());
        if(goods.getInventory()<list.getNumber()){
            String invenmsg = "货物id:"+goods.getGoods_id()+"货物名字为："+goods.getGoods_name()+"当前库存不足，发货失败，请先进货";
            session.setAttribute("invenmsg",invenmsg);
            Purchase_Order purchase_order = new Purchase_Order();
            purchase_order.setAddress("本公司地址");
            purchase_order.setDate("2019-12-31");
            purchase_order.setGoods_id(goods.getGoods_id());
            purchase_order.setNumber(0);
            purchase_order.setState("待执行");
            purchase_order.setSum(0);
            purchase_order.setWarehouse_keeper_id(0);
            iPurchaseOrderService.save(purchase_order);
        }//如果库存满足，则发货， 调用service的方法,修改发货单状态增加仓库管理员id和物流信息，并且修改库存
        else{
            list.setState("已确认");
            list.setEms_number(ems_number);
            list.setWarehouse_keeper_id(whId);
            iDispatchOrderService.updateDpGoods(list);
            //        修改库存
            goods.setInventory(goods.getInventory()-list.getNumber());
            iGoodsService.save(goods);
        }
        return "redirect:/dispatch-confirm.jsp";
    }


}
