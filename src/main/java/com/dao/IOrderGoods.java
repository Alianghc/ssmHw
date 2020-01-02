package com.dao;

import com.domain.Order_Goods;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface IOrderGoods {

    @Select("select * from order_goods")
    List<Order_Goods> findAll();

    @Select("select * from order_goods where order_id=#{id}")
    List<Order_Goods> findOne(int id);


    @Insert("replace into `Order_Goods` (id,price,sum,goods_name,order_id,state,number)values(#{id},#{price},#{sum},#{goods_name},#{order_id},#{state},#{number}) ")
    void save(Order_Goods order_goods);

    @Select("select * from order_goods where goods_name=#{s} and order_id=#{order_id}")
    Order_Goods findGoods(@Param("s") String s, @Param("order_id") String order_id);

    @Select("select sum(sum) from order_goods where goods_name=#{name}")
    int findGoodsxiaoshoue(@Param("name")String name);


}
