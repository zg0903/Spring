package com.itzg.structureModule.Adapter.Source;

import com.itzg.structureModule.Adapter.dao.Targetable;
//对象的适配器模式  接口定义太多方法 并不都需要
public class Adapter2 implements Targetable {
    private Source source;

    public Adapter2(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetale method!");
    }
}
