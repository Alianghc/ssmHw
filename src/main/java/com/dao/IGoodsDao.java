package com.dao;

import com.domain.Goods;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IGoodsDao {

    @Select("select * from goods")
    List<Goods> findAll();

    @Select("select * from goods where goods_id=#{id}")
    Goods findById(String id);


    @Select("select * from goods where goods_name=#{s}")
    Goods findByName(String s);

    @Insert("replace into goods (goods_id,goods_name,inventory,min_inventory,price)values(#{goods_id},#{goods_name},#{inventory},#{min_inventory},#{price})")
    void save(Goods goods);

}
