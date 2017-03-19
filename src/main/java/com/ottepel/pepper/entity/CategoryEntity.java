package com.ottepel.pepper.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Alexandr on 19.03.2017.
 */
@Entity
@Table(name = "category")
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @ManyToMany
    @JoinTable(
            name = "category_recipe",
            joinColumns = {
                    @JoinColumn(name = "category_id", referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "recipe_id", referencedColumnName = "id")
            })
    List<RecipeEntity> recipes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<RecipeEntity> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<RecipeEntity> recipes) {
        this.recipes = recipes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoryEntity that = (CategoryEntity) o;

        if (id != that.id) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        return recipes != null ? recipes.equals(that.recipes) : that.recipes == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (recipes != null ? recipes.hashCode() : 0);
        return result;
    }
}
