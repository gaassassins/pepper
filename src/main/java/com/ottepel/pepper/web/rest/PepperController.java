package com.ottepel.pepper.web.rest;

import com.ottepel.pepper.entity.*;
import com.ottepel.pepper.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/categories")
    public List<CategoryEntity> getCategories() {
        return categoryRepository.findAll();
    }

    @RequestMapping("/ingredients")
    public List<IngredientEntity> getIngredients() {
        return ingredientRepository.findAll();
    }
}
