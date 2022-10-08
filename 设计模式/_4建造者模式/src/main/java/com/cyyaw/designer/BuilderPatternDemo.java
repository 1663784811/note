package com.cyyaw.designer;

public class BuilderPatternDemo {


    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("============Veg Meal");
        vegMeal.showItems();
        System.out.println("总数:  " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\n==============Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("总数:  " + nonVegMeal.getCost());
    }
}
