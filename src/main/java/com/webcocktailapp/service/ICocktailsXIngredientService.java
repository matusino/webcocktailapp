package com.webcocktailapp.service;



import java.util.List;

import com.webcocktailapp.app.model.TcocktailsXIngredient;



public interface ICocktailsXIngredientService {
	
	public List<TcocktailsXIngredient> findAllCocktailsIngredientIds(List<Long> ingredientIds);
	
}
