package com.example.foodjournal;

public class FoodItem {

    private String name;
    private int protein;
    private int carbs;
    private int fats;

    public FoodItem(String name, int protein, int carbs, int fats) {
        this.name = name;
        this.protein = protein;
        this.carbs = carbs;
        this.fats = fats;
    }

    public String getName() {
        return name;
    }

    public int getProtein() {

        return protein;
    }

    public int getCarbs() {

        return carbs;
    }

    public int getFats() {

        return fats;
    }
}
