package com.service;

import com.domain.Goods;
import com.domain.Purchase_Order;

import java.util.List;

public interface IPurchaseOrderService {

    Goods findByName(String goodsName);

    void save(Purchase_Order purchase_order);

    List<Purchase_Order> findAll();

    Purchase_Order findById(String id);
}
