package com.itzg.structureModule.Flyweight.impl;

import com.itzg.structureModule.Flyweight.dao.Shape;
//享元模式的主要目的是实现对象的共享，即共享池，当系统中对象多的时候可以减少内存的开 销，通常与工厂模式一起使用。
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color
                + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}
