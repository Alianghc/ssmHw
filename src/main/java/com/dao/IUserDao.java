package com.dao;

import com.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IUserDao {
//    id,password,position,email,phone,name,sex,birth
    @Select("select * from user")
    List<User> findAll();

    @Select("select * from user where position=#{position}")
    List<User> findAllSale(String position);


    @Update("update user set name=#{name},sex=#{sex},birth=#{birth},position=#{position},password=#{password} where id=#{id}")
    void updateUser(User user);

    @Delete("delete from user where id=#{id} ")
    void deleteUser(Integer userId);

    @Insert("insert into user(name,password,phone,email,position,sex,birth)values(#{name},#{password},#{phone},#{email},#{position},#{sex},#{birth})")
    void saveUser(User user);

//    @Select("select * from user where username like #{username} ")
    @Select("select * from user where username like '%${value}%' ")
    List<User> findUserByName(String username);

    @Select("select count(*) from user ")
    int findTotalUser();

    @Select("select * from user  where id=#{id} ")
    User findById(Integer userId);

    @Select("select * from user  where name=#{name} ")
    User findByName(String name);

    /**
     * 注册用户和密码
     */
    void registerByUsernameAndPassword(@Param("username")String username,
                                       @Param("password")String password);

}
