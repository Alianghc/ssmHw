package com.service;

import com.domain.Client;
import com.domain.Goods;

import java.util.List;

public interface IGoodsService {

    //查询所有Goods
    public List<Goods> findAll();

    Goods findById(String id);
    Goods findByName(String name);
    //保存user


    void save(Goods goods);
    //删除user

    //
}
