package com.controller;

import com.domain.Goods;
import com.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("/goods")
public class goodsController {

    @Autowired
    private IGoodsService iGoodsService;


    @RequestMapping("/findAll")
    public String findAll(){
        HttpSession session   =   ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        // 调用service的方法
        List<Goods> list = iGoodsService.findAll();
        session.setAttribute("allGoods",list);
        return null;
    }

    @RequestMapping("/save")
    public String save(Goods goods){
        HttpSession session   =   ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        // 调用service的方法
        iGoodsService.save(goods);
        return "redirect:/goods-editable.jsp";
    }

}
