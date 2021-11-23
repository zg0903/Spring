package com.itzg.createModule.AbstractFactory.Impl;

import com.itzg.createModule.AbstractFactory.dao.Color;

public class Green  implements Color {
    @Override
    public void fill() {
        System.out.println("绿色填充实现");
    }
}
