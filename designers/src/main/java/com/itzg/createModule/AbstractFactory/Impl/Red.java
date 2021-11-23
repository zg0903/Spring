package com.itzg.createModule.AbstractFactory.Impl;

import com.itzg.createModule.AbstractFactory.dao.Color;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("红色填充实现");
    }
}
