package com.dao;


import com.domain.Client_Purchase_Goods;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface IClientPurchaseGoodsDao {

    @Insert("replace into client_purchase_goods(goods_name,qingdan_id,number)values(#{goods_name},#{qingdan_id},#{number})")
    void save(Client_Purchase_Goods client_purchase_goods);


}
