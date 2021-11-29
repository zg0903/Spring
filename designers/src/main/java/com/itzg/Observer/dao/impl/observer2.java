package com.itzg.Observer.dao.impl;

import com.itzg.Observer.dao.Observer;

public class observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }
}
