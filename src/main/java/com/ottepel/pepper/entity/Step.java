package com.ottepel.pepper.entity;

/**
 * Created by Alexandr on 17.03.2017.
 */
public class Step {
    private Integer id;
    private String title;
    private String description;
    private Integer time;

    public Step(Integer id, String title, String description, Integer time) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}
