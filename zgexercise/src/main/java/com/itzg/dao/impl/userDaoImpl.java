package com.itzg.dao.impl;

import com.itzg.dao.userDao;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class userDaoImpl implements userDao {
    @Override
    public void save() {
        System.out.println("save 方法");
    }
}
