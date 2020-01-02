package com.service.impl;


import com.dao.IClientPurchaseOrderDao;
import com.dao.IOrderGoods;
import com.domain.Client_Purchase_Goods;
import com.domain.Client_Purchase_Order;
import com.domain.Order_Goods;
import com.service.IClientPurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Service("clientPurchaseOrderService")
public class clientPurchaseOrderServiceImpl implements IClientPurchaseOrderService{

    @Autowired
    private IClientPurchaseOrderDao iClientPurchaseOrderDao;

    @Autowired
    private IOrderGoods iOrderGoods;



    @Override
    public int findCompanyAllSum(String a, String b) {
        return (int)iClientPurchaseOrderDao.findCompanyAllSum(a,b);
    }

    @Override
    public int goodsAllSum(String id) {
        return (int)iClientPurchaseOrderDao.goodsAllSum(id);
    }

    @Override
    public Order_Goods findGoods(String s,String order_id) {
        return iOrderGoods.findGoods(s,order_id);
    }

    public Integer getMaxId(){
        return iClientPurchaseOrderDao.maxID();
    }

    public void save(Client_Purchase_Order client_purchase_order){
        iClientPurchaseOrderDao.save(client_purchase_order);
    }

    public List<Client_Purchase_Order> findAll(){
        return iClientPurchaseOrderDao.findAll();
    }

    public Client_Purchase_Order findOne(int id){
        return iClientPurchaseOrderDao.findOne(id);
    }

}
