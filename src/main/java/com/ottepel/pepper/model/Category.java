package com.ottepel.pepper.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexandr on 17.03.2017.
 */
public class Category {
    private String name;
    private List<Recipe> recipeList;

    public Category() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Recipe> getRecipeList() {
        return recipeList;
    }

    public void setRecipeList(List<Recipe> recipeList) {
        this.recipeList = recipeList;
    }

    public void addRecipe(Recipe recipe) {
        if (recipeList == null) {
            recipeList = new ArrayList<>();
        }
        recipeList.add(recipe);
    }
}
