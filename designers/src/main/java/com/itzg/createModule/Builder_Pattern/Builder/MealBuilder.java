package com.itzg.createModule.Builder_Pattern.Builder;

import com.itzg.createModule.Builder_Pattern.Bean.Meal;

public abstract class MealBuilder {
    Meal meal = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal() {
        return meal;
    }

}
