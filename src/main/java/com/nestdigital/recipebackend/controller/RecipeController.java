package com.nestdigital.recipebackend.controller;

import com.nestdigital.recipebackend.dao.RecipeDao;
import com.nestdigital.recipebackend.model.RecipeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {

    @Autowired
    private RecipeDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path="/addrecipe",consumes = "application/json",produces = "application/json")
    public String addRecipes(@RequestBody RecipeModel recipes){
        System.out.println(recipes.toString());
        dao.save(recipes);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewrecipe")
    public List<RecipeModel> viewRecipes(){
        return (List<RecipeModel>) dao.findAll();
    }


}
