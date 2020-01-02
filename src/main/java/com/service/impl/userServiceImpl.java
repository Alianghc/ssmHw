package com.service.impl;

import com.dao.IUserDao;
import com.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.service.IUserService;

import java.util.List;


@Service("userService")
public class userServiceImpl implements IUserService {

    @Autowired
    private IUserDao iUserDao;

    public List<User> findAll() {
        return iUserDao.findAll();
    }

    @Override
    public List<User> findAllSale() {
        return iUserDao.findAllSale("销售人员");
    }

    public void updateUser(User user) {
        iUserDao.updateUser(user);
    }

    public void deleteUser(Integer userId) {
        iUserDao.deleteUser(userId);
    }

    public void saveUser(User user) {
        iUserDao.saveUser(user);
    }

    public List<User> findUserByName(String username) {
        return iUserDao.findUserByName(username);
    }

    public int findTotalUser() {
        System.out.println("业务层：test User findTotalUser()");
        return iUserDao.findTotalUser();
    }

    public User findById(Integer userId) {
        System.out.println("业务层：test User findById()");
        return iUserDao.findById(userId);
    }

    public User checkLogin(String username, String password) {

        if( iUserDao.findByName(username)!=null){
            User user = iUserDao.findByName(username);
            if(user != null && user.getPassword().equals(password)){
               return user;
            }
        }
        return null;
    }

}
