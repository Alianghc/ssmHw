package com.service.impl;

import com.dao.IPurchaseOrderDao;
import com.domain.Goods;
import com.domain.Purchase_Order;
import com.service.IPurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("purchaseServiceImpl")
public class purchaseServiceImpl implements IPurchaseOrderService {

    @Autowired
    private IPurchaseOrderDao iPurchaseOrderDao;

   public Goods findByName(String goodsName){
       return iPurchaseOrderDao.findByName(goodsName);
   }

    @Override
    public void save(Purchase_Order purchase_order) {
        iPurchaseOrderDao.save(purchase_order);
    }

    public List<Purchase_Order> findAll(){
       return iPurchaseOrderDao.findAll();
    }

    public Purchase_Order findById(String id){
        System.out.println(id);
       return iPurchaseOrderDao.findById(id);
    }
}
