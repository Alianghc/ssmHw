package com.service.impl;

import com.dao.IOrderDao;
import com.domain.Order;
import com.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("orderService")
public class orderServiceImpl implements IOrderService {

    @Autowired
    private IOrderDao iOrderDao;

    public List<Order> findAll() {
        return iOrderDao.findAll();
    }

    @Override
    public Order findOne(int id) {
        return iOrderDao.findOne(id);
    }

    @Override
    public void save(Order order) {
        iOrderDao.save(order);
    }

    public List<Order> findSaleYeji(int id){
        return iOrderDao.findSaleYeji(id);
    }

    public int clientAllSum(String email){
        return iOrderDao.clientAllSum(email);
    }

    public int findMaxId(){
        return iOrderDao.findMaxId();
    }
}
