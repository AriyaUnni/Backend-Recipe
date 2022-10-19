package com.nestdigital.recipebackend.dao;

import com.nestdigital.recipebackend.model.RecipeModel;
import org.springframework.data.repository.CrudRepository;

public interface RecipeDao extends CrudRepository<RecipeModel,Integer> {
}
