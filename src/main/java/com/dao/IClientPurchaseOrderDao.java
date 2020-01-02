package com.dao;

import com.domain.Client_Purchase_Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
@Repository
public interface IClientPurchaseOrderDao {

    @Select("select * from client_purchase_order")
    List<Client_Purchase_Order> findAll();

    @Select("select sum(sum) from client_purchase_order where date>=#{a} and date<=#{b}")
    int findCompanyAllSum(@Param("a")String a, @Param("b") String b);

    //error

    //error
    @Select("select sum(sum) from dispatch_order where goods_id=#{id}")
    int goodsAllSum(@Param("id")String id);

    @Select("select MAX(id) from client_purchase_order ")
    Integer maxID();

    @Insert("replace into client_purchase_order(id,date,address,state,sum,order_id)values(#{id},#{date},#{address},#{state},#{sum},#{order_id})")
    void save(Client_Purchase_Order client_purchase_order);

    @Select("select * from client_purchase_order where id=#{id}")
    Client_Purchase_Order findOne(int id);

}
