package com.dao;

import com.domain.Client;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IClientDao {
    @Select("select * from client")
    List<Client> findAll();

    @Update("update user set name=#{name},sex=#{sex},birth=#{birth},email=#{email},phone=#{phone}, where name=#{name}")
    void updateClient(Client client);

    @Delete("delete from client where name=#{clientName} ")
    void deleteClient(String clientName);

    @Insert("replace into client(name,phone,email,sex,birth)values(#{name},#{phone},#{email},#{sex},#{birth})")
    void saveClient(Client client);

    //    @Select("select * from user where username like #{username} ")
   /* @Select("select * from user where username like '%${value}%' ")
    List<Client> findClientByName(String clientName);*/

    @Select("select count(*) from client ")
    int findTotalClient();


    @Select("select * from client  where name=#{name} ")
    Client findByName(String name);
}
