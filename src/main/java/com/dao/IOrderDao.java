package com.dao;

import com.domain.Order;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IOrderDao {

    @Select("select * from `order`")
    List<Order> findAll();

    @Select("select * from `order` where salesman_id=#{id}")
    List<Order> findSaleYeji(int id);

    @Select("select * from `order` where id=#{id}")
    Order findOne(int id);

    @Insert("replace into `order` (id,date,address,state,client_email,salesman_id,sum)values(#{id},#{date},#{address},#{state},#{client_email},#{salesman_id},#{sum})")
    void save(Order order);

    @Select("select sum(sum) from `order` where client_email=#{email}")
    int clientAllSum(@Param("email")String email);

    @Select("select MAX(id) from `order` ")
    int findMaxId();




}
