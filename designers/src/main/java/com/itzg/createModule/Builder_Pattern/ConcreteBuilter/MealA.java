package com.itzg.createModule.Builder_Pattern.ConcreteBuilter;

import com.itzg.createModule.Builder_Pattern.Builder.MealBuilder;

public class MealA extends MealBuilder {
    @Override
    public void buildFood() {
        getMeal().setFood("炸鸡");
    }

    @Override
    public void buildDrink() {
        getMeal().setDrink("可乐");
    }
}
