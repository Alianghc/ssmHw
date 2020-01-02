package com.controller;

import com.domain.Order_Goods;
import com.service.IOrderGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/orderGoods")
public class orderGoodsController {

    @Autowired
    private IOrderGoodsService iOrderGoodsService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        HttpSession session   =   ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        // 调用service的方法
        List<Order_Goods> list = iOrderGoodsService.findAll();
        session.setAttribute("allOrderGoods",list);
        return null;
    }
    @RequestMapping("/findGoodsxiaoshoue")
    public String findGoodsxiaoshoue(String name){
        HttpSession session   =   ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        // 调用service的方法\
        System.out.println("该goods");
        System.out.println(name);
        float sum = iOrderGoodsService.findGoodsxiaoshoue(name);
        String msg = "关于该商品的销售额为："+sum+"元";
        session.setAttribute("msg",msg);
        return "redirect:/xiaoshoue.jsp";
    }

    @RequestMapping("/findOne")
    public String findOne(HttpServletRequest httpServletRequest){
        HttpSession session   =   ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        String  id = httpServletRequest.getParameter("orderID");
        // 调用service的方法
        List<Order_Goods> list = iOrderGoodsService.findOne(Integer.parseInt(id));
        for(int i = list.size() - 1; i >= 0; i--){
            String item = list.get(i).getState();
            if(!(item.equals("未付款"))){
                list.remove(item);
            }
        }
        session.setAttribute("aOrderGoods",list);
        return "redirect:/caigoulist-add.jsp";
    }

}
