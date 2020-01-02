package com.controller;

import com.domain.Goods;
import com.domain.Order;
import com.domain.Order_Goods;
import com.domain.User;
import com.service.IGoodsService;
import com.service.IOrderGoodsService;
import com.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/order")
public class orderController {

    @Autowired
    private IOrderService iOrderService;

    @Autowired
    private IGoodsService iGoodsService;

    @Autowired
    private IOrderGoodsService iOrderGoodsService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        HttpSession session   =   ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        // 调用service的方法
        List<Order> list = iOrderService.findAll();
        System.out.println(list);
        session.setAttribute("allOrder",list);
        return null;
    }

    @RequestMapping("/findSaleHetong")
    public String findSaleHetong(Model model){
        HttpSession session   =   ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        // 调用service的方法
        User user1 = (User)session.getAttribute("loginUser");
        List<Order> list = iOrderService.findSaleYeji((int)user1.getId());
        session.setAttribute("saleHetong",list);
        return "redirect:/saleman-hetong.jsp";
    }

    @RequestMapping("/findSaleYeji")
    public String findSaleYeji(Model model){
        HttpSession session   =   ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        // 调用service的方法
        User user1 = (User)session.getAttribute("loginUser");
        List<Order> list = iOrderService.findSaleYeji((int)user1.getId());
        float sum=0;
        for (Order order : list) {
            sum += order.getSum();
        }
        String msg = "该段时间内您的销售额为："+sum+"元";
        session.setAttribute("saleYejiMsg",msg);
        System.out.println(msg);
        return "redirect:/saleman-yeji.jsp";
    }


    @RequestMapping("/findOne")
    public String findOne(HttpServletRequest httpServletRequest){
        String  id = httpServletRequest.getParameter("id");
        HttpSession session   =   ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        // 调用service的方法
        Order list = iOrderService.findOne(Integer.parseInt(id));
        if(list.getState().equals("执行中")){
            session.setAttribute("testOrdermsg",list);
        }
        else session.setAttribute("aOrder",list);
        return "redirect:/hetong-editable.jsp";
    }

    @RequestMapping("/findClientAllSum")
    public String findClientAllSum(String email){
        System.out.println("emial=======");
        System.out.println(email);
        int sum = iOrderService.clientAllSum(email);
        HttpSession session   =   ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest().getSession();
        String msg = "关于该客户的销售额为："+sum+"元";

        session.setAttribute("msg",msg);
        return "redirect:/xiaoshoue.jsp";
    }


    @RequestMapping("/save")
    public String save(Order order){
        HttpSession session   =   ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        // 调用service的方法,修改合同状态
        if(order.getState()==null){
            order.setState("执行中");
        }
        System.out.println("修改状态");
        System.out.println(order);

        List<Order_Goods> orderGoods=order.getOrderGoods();
        //计算合同总金额
        float sum=0;
        for (Order_Goods orderGood : orderGoods) {
            if (orderGood.getNumber() != 0) {
                Goods gs = iGoodsService.findByName(orderGood.getGoods_name());
                int b = orderGood.getNumber();
                float a = gs.getPrice();
                sum = sum + a * b;
            }
        }
        order.setSum(sum);
        order.setOrderGoods(orderGoods);
        iOrderService.save(order);
        System.out.println(order);

        //保存合同货物
        for (Order_Goods orderGood : orderGoods) {
            if (orderGood.getNumber() != 0) {
                Goods gs = iGoodsService.findByName(orderGood.getGoods_name());
                int b = orderGood.getNumber();
                float a = gs.getPrice();
                orderGood.setPrice(a);
                orderGood.setGoods_name(gs.getGoods_name());
                orderGood.setSum(a*b);
                orderGood.setOrder_id(iOrderService.findMaxId());
                orderGood.setState("未付款");
                iOrderGoodsService.save(orderGood);
            }
        }


        System.out.println("save orderGoods Success");
        return "redirect:/order-editable.jsp";
    }
}
