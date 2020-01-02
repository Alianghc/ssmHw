package com.test;

import com.domain.Client;
import com.domain.Goods;
import com.domain.Order;
import com.domain.User;
import com.service.impl.clientServiceImpl;
import com.service.impl.goodsServiceImpl;
import com.service.impl.orderServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.service.impl.userServiceImpl;

import java.util.List;

public class testSpring {

    @Test
    public void runSpring(){
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取对象
        userServiceImpl us = (userServiceImpl) ac.getBean("userService");
        orderServiceImpl os = (orderServiceImpl) ac.getBean("orderService");
        goodsServiceImpl gs = (goodsServiceImpl) ac.getBean("goodsService");
        clientServiceImpl cs = (clientServiceImpl) ac.getBean("clientService");
        //调用方法
        User test = new User();
        test.setBirth("2019-1-1");
        test.setEmail("0");
        test.setName("lhcup");
        test.setPassword("0");
        test.setPhone("0");
        test.setPosition("0");
        test.setSex("0");
        us.deleteUser(5);
        us.updateUser(test);
        test.setSex("1");
        us.saveUser(test);
        us.findById(4);
        us.findTotalUser();
        /*List<User> listu = us.findAll();
        List<Client> listc = cs.findAll();
        List<Goods> listg = gs.findAll();
        List<Order> listo = os.findAll();
*/
       /* for(User user : listu){
            System.out.println(user);
        }
        for(Goods goods : listg){
            System.out.println(goods);
        }
        for(Client client : listc){
            System.out.println(client);
        }
        for(Order  order : listo){
            System.out.println(order);
        }*/
    }
}
