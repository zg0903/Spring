package com.itzg.factory;

import com.itzg.dao.impl.userDaoImpl;
import com.itzg.dao.userDao;

public class factoryCreate {
    private com.itzg.dao.userDao userDao;

    public userDaoImpl getinstance(){
        return new userDaoImpl();
    }
    //    public static userDaoImpl getUserDao(){
//        return new userDaoImpl();
//    }


}
