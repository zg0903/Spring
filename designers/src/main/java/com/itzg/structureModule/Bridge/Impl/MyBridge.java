package com.itzg.structureModule.Bridge.Impl;

public class MyBridge extends Bridge{
    @Override
    public void method() {
        getSource().method();
    }
}
