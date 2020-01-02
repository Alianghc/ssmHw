package com.service.impl;

import com.dao.IOrderGoods;
import com.domain.Order_Goods;
import com.service.IOrderGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderGoodsService")
public class orderGoodsServiceImpl implements IOrderGoodsService {

    @Autowired
    private IOrderGoods iOrderGoods;

    @Override
    public List<Order_Goods> findAll() {
        return iOrderGoods.findAll();
    }

    @Override
    public void save(Order_Goods order_goods) {
        iOrderGoods.save(order_goods);
    }

    @Override
    public List<Order_Goods> findOne(int id) {
        return iOrderGoods.findOne(id);
    }

    @Override
    public float findGoodsxiaoshoue(String name) {
        return iOrderGoods.findGoodsxiaoshoue(name);
    }
}
