package com.ottepel.pepper.entity;

import javax.persistence.*;

/**
 * Created by Alexandr on 19.03.2017.
 */

@Entity
@Table(name = "images")
public class ImagesEntity {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "url")
    private String url;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private RecipeEntity recipe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public RecipeEntity getRecipe() {
        return recipe;
    }

    public void setRecipe(RecipeEntity recipe) {
        this.recipe = recipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImagesEntity that = (ImagesEntity) o;

        if (id != that.id) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        return recipe != null ? recipe.equals(that.recipe) : that.recipe == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (recipe != null ? recipe.hashCode() : 0);
        return result;
    }
}
