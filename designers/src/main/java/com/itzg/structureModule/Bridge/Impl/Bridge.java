package com.itzg.structureModule.Bridge.Impl;

import com.itzg.structureModule.Bridge.Dao.Sourceable;

//桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。桥接的用意是：将抽象 化与实现化解耦，使得二者可以独立变化，像我们常用的 JDBC 桥 DriverManager 一样，JDBC 进行连接数据库的时候，在各个数据库之间进行切换，基本不需要动太多的代码，甚至丝毫不 用动，原因就是 JDBC 提供统一接口，每个数据库提供各自的实现，用一个叫做数据库驱动 的程序来桥接就行了
public abstract class Bridge {

    private Sourceable source;

    public void method() {
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
