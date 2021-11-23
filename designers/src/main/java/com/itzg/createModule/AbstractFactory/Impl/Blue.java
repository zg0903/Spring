package com.itzg.createModule.AbstractFactory.Impl;

import com.itzg.createModule.AbstractFactory.dao.Color;

public class Blue  implements Color {
    @Override
    public void fill() {
        System.out.println("蓝色填充实现");
    }
}
