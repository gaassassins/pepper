package com.ottepel.pepper.entity;

import javax.persistence.*;

/**
 * Created by Alexandr on 19.03.2017.
 */
@Entity
@Table(name = "ingredient")
public class IngredientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "weight")
    private int weight;

    @Column(name = "volume")
    private int volume;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private RecipeEntity recipe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public RecipeEntity getRecipe() {
        return recipe;
    }

    public void setRecipe(RecipeEntity recipe) {
        this.recipe = recipe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IngredientEntity that = (IngredientEntity) o;

        if (id != that.id) return false;
        if (weight != that.weight) return false;
        if (volume != that.volume) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return recipe != null ? recipe.equals(that.recipe) : that.recipe == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + weight;
        result = 31 * result + volume;
        result = 31 * result + (recipe != null ? recipe.hashCode() : 0);
        return result;
    }
}
