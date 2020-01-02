package com.test;

import com.dao.IClientDao;
import com.dao.IGoodsDao;
import com.dao.IOrderDao;
import com.dao.IUserDao;
import com.domain.Client;
import com.domain.Goods;
import com.domain.Order;
import com.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class testMybatis {

//    测试Spring组合mybatis

    @Test
    public void runMybatis() throws Exception{
        // 加载配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        // 创建SqlSession对象
        SqlSession session = factory.openSession();
        // 获取到代理对象
        IUserDao dao = session.getMapper(IUserDao.class);
        // 查询所有数据
        List<User> list = dao.findAll();
        System.out.println("=====user====== ");
        for(User user : list){
            System.out.println(user);
        }

        IClientDao daoc = session.getMapper(IClientDao.class);
        List<Client> listc = daoc.findAll();
        System.out.println("=====client====== ");
        for(Client client : listc){
            System.out.println(client);
        }

        IGoodsDao daog = session.getMapper(IGoodsDao.class);
        List<Goods> listg = daog.findAll();
        System.out.println("=====goods====== ");
        for(Goods goods : listg){
           System.out.println(goods);
        }

        IOrderDao daoo = session.getMapper(IOrderDao.class);
        List<Order> listo = daoo.findAll();
        System.out.println("=====order====== ");
        for(Order  order : listo){
           System.out.println(order);
        }
        // 关闭资源
        session.close();
        in.close();
    }
}
