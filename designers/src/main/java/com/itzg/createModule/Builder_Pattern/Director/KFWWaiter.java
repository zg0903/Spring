package com.itzg.createModule.Builder_Pattern.Director;

import com.itzg.createModule.Builder_Pattern.Bean.Meal;
import com.itzg.createModule.Builder_Pattern.Builder.MealBuilder;

public class KFWWaiter {
    private MealBuilder mealBuilder;

    public KFWWaiter(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal construct() {
        mealBuilder.buildFood();
        mealBuilder.buildDrink();
        return mealBuilder.getMeal();
    }


}
