package com.service;

import com.domain.Order_Goods;

import java.util.List;

public interface IOrderGoodsService {

    //查询所有user
    public List<Order_Goods> findAll();

    List<Order_Goods> findOne(int id);

    void save(Order_Goods order_goods);

    float findGoodsxiaoshoue(String name);

}
