package com.ottepel.pepper.model;

/**
 * Created by Alexandr on 17.03.2017.
 */
public class Step {
    private Integer number;
    private String title;
    private String description;
    private Integer time;

    public Step() {

    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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
