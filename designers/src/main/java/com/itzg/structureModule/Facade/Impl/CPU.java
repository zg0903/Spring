package com.itzg.structureModule.Facade.Impl;
//外观模式是为了解决类与类之家的依赖关系的，像 spring 一样，可以将类和类之间的关系配 置到配置文件中，而外观模式就是将他们的关系放在一个 Facade 类中，降低了类类之间的耦 合度，该模式中没有涉及到接口
public class CPU {
    public void startup(){
        System.out.println("cpu startup!");
    }
    public void shuddwon(){
        System.out.println("cpu shuddwon!");
    }

}
