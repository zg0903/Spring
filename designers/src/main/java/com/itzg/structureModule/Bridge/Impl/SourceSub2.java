package com.itzg.structureModule.Bridge.Impl;

import com.itzg.structureModule.Bridge.Dao.Sourceable;

public class SourceSub2 implements Sourceable {
    @Override
    public void method() {
        System.out.println("second sub!");
    }
}
