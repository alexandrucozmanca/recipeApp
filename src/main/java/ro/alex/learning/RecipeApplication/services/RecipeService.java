package ro.alex.learning.RecipeApplication.services;

import ro.alex.learning.RecipeApplication.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
