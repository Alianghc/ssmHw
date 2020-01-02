package com.service.impl;


import com.dao.IClientPurchaseGoodsDao;
import com.domain.Client_Purchase_Goods;
import com.service.IClientPurchaseGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("clientPurchaseGoodsService")
public class clientPurchaseGoodsServiceImpl implements IClientPurchaseGoodsService {

    @Autowired
    private IClientPurchaseGoodsDao iClientPurchaseGoodsDao;

    public void save(Client_Purchase_Goods client_purchase_goods){
        iClientPurchaseGoodsDao.save(client_purchase_goods);
    }

}
