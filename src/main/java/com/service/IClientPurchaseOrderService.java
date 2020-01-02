package com.service;

import com.domain.Client_Purchase_Goods;
import com.domain.Client_Purchase_Order;
import com.domain.Order_Goods;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface IClientPurchaseOrderService {

    int findCompanyAllSum(String a,String b);


    int goodsAllSum(String id);

    Order_Goods findGoods(String s,String order_id);

    void save(Client_Purchase_Order client_purchase_order);
    Integer getMaxId();

    List<Client_Purchase_Order> findAll();

    Client_Purchase_Order findOne(int id);

}
