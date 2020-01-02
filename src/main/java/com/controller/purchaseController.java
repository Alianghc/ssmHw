package com.controller;


import com.domain.Goods;
import com.domain.Purchase_Order;
import com.service.IGoodsService;
import com.service.IPurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/purchase")
public class purchaseController {


    @Autowired
    private IPurchaseOrderService iPurchaseOrderService;

    @Autowired
    private IGoodsService iGoodsService;

    @RequestMapping(value = "/findAll",method = RequestMethod.POST)
    public void findAll(){
        HttpSession session   =   ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        // 调用service的方法
        List<Purchase_Order> list = iPurchaseOrderService.findAll();
        session.setAttribute("allphOrder",list);
        List<Purchase_Order> list1 = new ArrayList<>();
        List<Purchase_Order> list2 = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getState().equals("已确认")){
                list1.add(list.get(i));
            }
            else list2.add(list.get(i));
        }
        System.out.println("purchase list1");
        System.out.println(list1);
        System.out.println("purchase list2");
        System.out.println(list2);
        session.setAttribute("yiquerenPurchase",list1);
        session.setAttribute("daizhixingPurchase",list2);

    }

    @RequestMapping(value = "/confirm")
    public String confirm(HttpServletRequest httpServletRequest) {
        HttpSession session = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        int whId = Integer.parseInt(httpServletRequest.getParameter("whId"));
        String ems_number = httpServletRequest.getParameter("number");
        String id = (String) session.getAttribute("purchaseID");
        //查询该进货单，修改状态，
        Purchase_Order list = iPurchaseOrderService.findById(id);
        list.setState("已确认");
        list.setNumber(Integer.parseInt(ems_number));
        list.setWarehouse_keeper_id(whId);
        list.setSum(100);
        System.out.println(list);
        iPurchaseOrderService.save(list);
        //修改库存list.setNumber(list.getNumber());
        Goods goods = iGoodsService.findById(String.valueOf(list.getGoods_id()));
        goods.setInventory(goods.getInventory()+list.getNumber());
        iGoodsService.save(goods);
        return "redirect:/purchase-confirm.jsp";
    }
}
