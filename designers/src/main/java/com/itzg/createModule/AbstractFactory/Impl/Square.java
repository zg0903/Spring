package com.itzg.createModule.AbstractFactory.Impl;

import com.itzg.createModule.AbstractFactory.dao.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("正方方形draw方法实现");
    }
}
