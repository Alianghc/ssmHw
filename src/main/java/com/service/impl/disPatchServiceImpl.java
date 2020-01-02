package com.service.impl;

import com.controller.dispatchOrder;
import com.dao.IDispatchOrderDao;
import com.domain.Dispatch_Order;
import com.service.IDispatchOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("dispatchService")
public class disPatchServiceImpl implements IDispatchOrderService {

    @Autowired
    private IDispatchOrderDao iDispatchOrderDao;

    public List<Dispatch_Order> findAll(){
        return iDispatchOrderDao.findAll();
    }

    public void save(Dispatch_Order dispatch_order){
        iDispatchOrderDao.save(dispatch_order);
    }

    public Dispatch_Order findById(int id){
       return iDispatchOrderDao.findById(id);
    }

    public void updateDpGoods(Dispatch_Order dispatch_order){
        iDispatchOrderDao.updateDpGoods(dispatch_order);
    }

}
