package com.itzg.createModule.AbstractFactory.factory;

import com.itzg.createModule.AbstractFactory.dao.Color;
import com.itzg.createModule.AbstractFactory.dao.Shape;

// 步骤5 为 Color 和 Shape 对象创建抽象类来获取工厂。
public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
