package com.itzg.zgexercise;

import com.itzg.dao.impl.userDaoImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ZgexerciseApplication {

    public static void main(String[] args) {
//        SpringApplication.run(ZgexerciseApplication.class, args);
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("appConfig.xml");
        userDaoImpl userDao = (userDaoImpl) app.getBean("getinstance");
        userDao.save();
    }

}
