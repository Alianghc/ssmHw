package com.service;

import com.domain.Order;

import java.util.List;

public interface IOrderService {

    //查询所有Order
    public List<Order> findAll();

    Order findOne(int id);

    //保存Order
    void save(Order order);
    //删除user

    int clientAllSum(String email);

    List<Order> findSaleYeji(int id);

    int findMaxId();
}
