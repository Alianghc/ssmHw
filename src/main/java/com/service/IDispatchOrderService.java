package com.service;

import com.controller.dispatchOrder;
import com.domain.Dispatch_Order;
import org.springframework.ui.Model;

import java.util.List;

public interface IDispatchOrderService {

    List<Dispatch_Order> findAll();

    void save(Dispatch_Order dispatch_order);

    Dispatch_Order findById(int id);


    void updateDpGoods(Dispatch_Order dispatch_order);
}
