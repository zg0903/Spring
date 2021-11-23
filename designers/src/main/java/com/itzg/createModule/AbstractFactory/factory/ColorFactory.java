package com.itzg.createModule.AbstractFactory.factory;

import com.itzg.createModule.AbstractFactory.Impl.Blue;
import com.itzg.createModule.AbstractFactory.Impl.Green;
import com.itzg.createModule.AbstractFactory.Impl.Red;
import com.itzg.createModule.AbstractFactory.dao.Color;
import com.itzg.createModule.AbstractFactory.dao.Shape;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }


    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
