package com.service.impl;

import com.dao.IGoodsDao;
import com.dao.IUserDao;
import com.domain.Goods;
import com.domain.User;
import com.service.IGoodsService;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("goodsService")
public class goodsServiceImpl implements IGoodsService {

    @Autowired
    private IGoodsDao iGoodsDao;

    public List<Goods> findAll() {
       return iGoodsDao.findAll();
    }

    public Goods findById(String id){
        return iGoodsDao.findById(id);
    }

    public Goods findByName(String name){
        return iGoodsDao.findByName(name);
    }

    public void save(Goods goods){
        iGoodsDao.save(goods);
    }
}
