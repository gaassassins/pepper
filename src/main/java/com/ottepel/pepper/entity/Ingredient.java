package com.ottepel.pepper.entity;

/**
 * Created by Alexandr on 17.03.2017.
 */
public class Ingredient {
    private String name;
    private Integer weight;
    private Integer volume;

    public Ingredient(String name, Integer weight, Integer volume) {
        this.name = name;
        this.weight = weight;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
}
