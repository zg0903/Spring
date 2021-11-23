package com.itzg.createModule.AbstractFactory.factory;

import com.itzg.createModule.AbstractFactory.Impl.Circle;
import com.itzg.createModule.AbstractFactory.Impl.Rectangel;
import com.itzg.createModule.AbstractFactory.Impl.Square;
import com.itzg.createModule.AbstractFactory.dao.Color;
import com.itzg.createModule.AbstractFactory.dao.Shape;

//步骤 6
//创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTANCE")) {
            return new Rectangel();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
