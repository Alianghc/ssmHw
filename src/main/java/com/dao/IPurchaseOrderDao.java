package com.dao;

import com.domain.Goods;
import com.domain.Purchase_Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IPurchaseOrderDao {

    @Select("select * from purchase_order")
    List<Purchase_Order> findAll();


    @Select("select * from purchase_order where id=#{id}")
    Purchase_Order findById(String id);


    @Select("select * from goods where goods_name=#{s}")
    Goods findByName(String s);

    @Insert("replace into purchase_order(id,date,address,state,sum,goods_id,number,warehouse_keeper_id)values(#{id},#{date},#{address},#{state},#{sum},#{goods_id},#{number},#{warehouse_keeper_id})")
    void save(Purchase_Order purchase_order);

}
