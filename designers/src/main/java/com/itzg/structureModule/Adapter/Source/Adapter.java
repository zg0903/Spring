package com.itzg.structureModule.Adapter.Source;
//01. 类的适配器模式
import com.itzg.structureModule.Adapter.dao.Targetable;

public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
