package com.ottepel.pepper.web.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ottepel.pepper.entity.CategoryEntity;
import com.ottepel.pepper.entity.IngredientEntity;
import com.ottepel.pepper.entity.RecipeEntity;
import com.ottepel.pepper.entity.StepEntity;
import com.ottepel.pepper.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexandr on 17.03.2017.
 */
@RestController
public class PepperController {

    @Autowired
    private CategoryEntityRepository categoryRepository;

    @Autowired
    private IngredientEntityRepository ingredientRepository;

    @Autowired
    private RecipeEntityRepository recipeRepository;

    @Autowired
    private StepEntityRepository stepRepository;

    @Autowired
    private ImagesEntityRepository imagesRepository;

    @RequestMapping("/")
    public List<RecipeEntity> getRecipes() {
        return recipeRepository.findAll();
    }

    @RequestMapping("/cat")
    public List<CategoryEntity> getCategories() {
        List<CategoryEntity> list = categoryRepository.findAll();
//        Gson gson = new GsonBuilder()
//                .setPrettyPrinting()
//                .create();
//
//        System.out.println(gson.toJson(list));

        return list;
    }
}
