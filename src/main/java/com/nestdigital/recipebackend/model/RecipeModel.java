package com.nestdigital.recipebackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recipe")
public class RecipeModel {
    @Id
    @GeneratedValue
    private int id;
    private String recipeName;
    private String type;
    private String description;
    private String postedDate;

    public RecipeModel(int id, String recipeName, String type, String description, String postedDate) {
        this.id = id;
        this.recipeName = recipeName;
        this.type = type;
        this.description = description;
        this.postedDate = postedDate;
    }

    public RecipeModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(String postedDate) {
        this.postedDate = postedDate;
    }
}
