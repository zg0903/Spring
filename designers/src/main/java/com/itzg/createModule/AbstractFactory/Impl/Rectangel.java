package com.itzg.createModule.AbstractFactory.Impl;

import com.itzg.createModule.AbstractFactory.dao.Shape;

public class Rectangel  implements Shape {
    @Override
    public void draw() {
        System.out.println("长方形draw方法实现");
    }
}
