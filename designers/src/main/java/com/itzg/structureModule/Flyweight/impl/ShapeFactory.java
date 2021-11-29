package com.itzg.structureModule.Flyweight.impl;

import com.itzg.structureModule.Flyweight.dao.Shape;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String clor) {
        Circle circle = (Circle) circleMap.get(clor);
        if (circle == null) {
            circle = new Circle(clor);
            circleMap.put(clor, circle);
            System.out.println("Creating circle of color : " + clor);
        }
        return circle;
    }
}
