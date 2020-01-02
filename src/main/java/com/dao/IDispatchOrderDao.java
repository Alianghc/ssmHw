package com.dao;

import com.controller.dispatchOrder;
import com.domain.Dispatch_Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IDispatchOrderDao {

    @Select("select * from dispatch_order")
    List<Dispatch_Order> findAll();

    @Select("select * from dispatch_order where id=#{id}")
    Dispatch_Order findById(int id);

    @Update("update dispatch_order set state=#{state},warehouse_keeper_id=#{warehouse_keeper_id},ems_number=#{ems_number} where id = #{id}")
    void updateDpGoods(Dispatch_Order dispatch_order);


    @Insert("replace into dispatch_order (date,address,state,sum,goods_name,number,order_id,sales_keeper_id,warehouse_keeper_id,ems_number)values(#{date},#{address},#{state},#{sum},#{goods_name},#{number},#{order_id},#{sales_keeper_id},#{warehouse_keeper_id},#{ems_number})")
    void save(Dispatch_Order dispatch_order);


}
