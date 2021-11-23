package com.itzg;

import com.itzg.createModule.AbstractFactory.dao.Color;
import com.itzg.createModule.AbstractFactory.dao.Shape;
import com.itzg.createModule.AbstractFactory.factory.AbstractFactory;
import com.itzg.createModule.AbstractFactory.factory.FactoryProducer;
import com.itzg.createModule.Factory_Method.dao.sender;
import com.itzg.createModule.Factory_Method.factory.SendMailFactory;

public class Test {
    //    Factory_MEthod
    @org.junit.jupiter.api.Test
    public void test1() {
        SendMailFactory sendMailFactory = new SendMailFactory();
        sender produce = sendMailFactory.produce();
        produce.Send();
        produce.OutTime();
    }


    //AbstractFactory
    @org.junit.jupiter.api.Test
    public void test2() {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        AbstractFactory color = FactoryProducer.getFactory("COLOR");
        Color red = color.getColor("RED");
        red.fill();
    }
}
