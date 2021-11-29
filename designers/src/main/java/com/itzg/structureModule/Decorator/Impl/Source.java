package com.itzg.structureModule.Decorator.Impl;

import com.itzg.structureModule.Decorator.Dao.Sourceable;

public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
