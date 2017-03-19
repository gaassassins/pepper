package com.ottepel.pepper.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Alexandr on 19.03.2017.
 */
@Entity
@Table(name = "recipe")
public class RecipeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "titleImageUrl")
    private String titleImageUrl;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "recipe")
    private List<ImagesEntity> images;

    @Column(name = "description")
    private String description;

    @Column(name = "portions")
    private int portions;

    @Column(name = "weight")
    private int weight;

    @Column(name = "time")
    private int time;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "recipe")
    private List<StepEntity> steps;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "recipe")
    private List<IngredientEntity> ingredients;

    @ManyToMany(mappedBy = "recipes", cascade = CascadeType.DETACH)
    private List<CategoryEntity> categories;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitleImageUrl() {
        return titleImageUrl;
    }

    public void setTitleImageUrl(String titleImageUrl) {
        this.titleImageUrl = titleImageUrl;
    }

    public List<ImagesEntity> getImages() {
        return images;
    }

    public void setImages(List<ImagesEntity> images) {
        this.images = images;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPortions() {
        return portions;
    }

    public void setPortions(int portions) {
        this.portions = portions;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public List<StepEntity> getSteps() {
        return steps;
    }

    public void setSteps(List<StepEntity> steps) {
        this.steps = steps;
    }

    public List<IngredientEntity> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<IngredientEntity> ingredients) {
        this.ingredients = ingredients;
    }

    public List<CategoryEntity> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryEntity> categories) {
        this.categories = categories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RecipeEntity that = (RecipeEntity) o;

        if (id != that.id) return false;
        if (portions != that.portions) return false;
        if (weight != that.weight) return false;
        if (time != that.time) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (titleImageUrl != null ? !titleImageUrl.equals(that.titleImageUrl) : that.titleImageUrl != null)
            return false;
        if (images != null ? !images.equals(that.images) : that.images != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (steps != null ? !steps.equals(that.steps) : that.steps != null) return false;
        if (ingredients != null ? !ingredients.equals(that.ingredients) : that.ingredients != null) return false;
        return categories != null ? categories.equals(that.categories) : that.categories == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (titleImageUrl != null ? titleImageUrl.hashCode() : 0);
        result = 31 * result + (images != null ? images.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + portions;
        result = 31 * result + weight;
        result = 31 * result + time;
        result = 31 * result + (steps != null ? steps.hashCode() : 0);
        result = 31 * result + (ingredients != null ? ingredients.hashCode() : 0);
        result = 31 * result + (categories != null ? categories.hashCode() : 0);
        return result;
    }
}
