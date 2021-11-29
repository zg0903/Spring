package com.itzg.structureModule.Proxy.Impl;

import com.itzg.structureModule.Proxy.dao.Sourceable;

public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("原始方法");
    }
}
