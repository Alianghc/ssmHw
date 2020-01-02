package com.service;

import com.domain.User;

import java.util.List;

public interface IUserService {

    //查询所有user
    public List<User> findAll();

    //查询所有销售人员
    List<User> findAllSale();

    void updateUser(User user);

    void deleteUser(Integer userId);

    void saveUser(User user);

    List<User> findUserByName(String username);

    int findTotalUser();

    User findById(Integer userId);

    //检验用户登录
    User checkLogin(String username,String password);
}
