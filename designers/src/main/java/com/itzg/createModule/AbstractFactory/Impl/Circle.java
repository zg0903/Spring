package com.itzg.createModule.AbstractFactory.Impl;

import com.itzg.createModule.AbstractFactory.dao.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("圆形draw方法实现");
    }
}