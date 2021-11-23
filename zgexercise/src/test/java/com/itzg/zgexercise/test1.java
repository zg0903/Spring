package com.itzg.zgexercise;

import com.itzg.dao.impl.userDaoImpl;
import com.itzg.service.impl.userServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
    @Test
    public void test1() {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("appConfig.xml");
        userDaoImpl userDao = (userDaoImpl) app.getBean("userDao");
        userDao.save();
    }

    //    静态工厂  非静态工厂
    @Test
    public void test2() {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("appConfig.xml");
        userDaoImpl userDao = (userDaoImpl) app.getBean("getinstance");
        userDao.save();
    }

    //    serviceImpl  setter方法创建对象  构造器创建对象
    @Test
    public void test3() {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("appConfig.xml");
        userServiceImpl userDao = (userServiceImpl) app.getBean("userService");
        userDao.save();
    }


}
