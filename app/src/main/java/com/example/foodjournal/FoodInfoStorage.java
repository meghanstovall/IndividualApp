package com.example.foodjournal;

import java.util.ArrayList;
import java.util.List;

public class FoodInfoStorage {

    private static List<FoodItem> foodItems = new ArrayList<>();


    public static List<FoodItem> getFoodItems() {
        return foodItems;
    }

    public static int getTotalProtein(){
        int num = 0;
        for(int i = 0; i <= foodItems.size(); i++){
            num = num + foodItems.get(i).getProtein();
        }
        return num;
    }

    public static int getTotalCarbs(){
        int num = 0;
        for(int i = 0; i <= foodItems.size(); i++){
            num = num + foodItems.get(i).getCarbs();
        }
        return num;
    }

    public static int getTotalFats(){
        int num = 0;
        for(int i = 0; i <= foodItems.size(); i++){
            num = num + foodItems.get(i).getFats();
        }
        return num;
    }

}
