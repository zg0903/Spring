package com.itzg.Observer.dao.impl;

import com.itzg.Observer.dao.Observer;

public class observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}
