package com.itzg.service.impl;

import com.itzg.dao.impl.userDaoImpl;
import com.itzg.service.userService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class userServiceImpl implements userService {
    @Resource(name = "userDao")
    private userDaoImpl userDao;

    public userServiceImpl() {
    }

    public userServiceImpl(userDaoImpl userDao) {
        this.userDao = userDao;
    }

    public void setUserDao(userDaoImpl userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
//        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("appConfig.xml");
//        userDaoImpl userDao = (userDaoImpl) app.getBean("getinstance");
//        userDao.save();
        userDao.save();

    }
}
