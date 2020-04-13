package com.webcocktailapp.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcocktailapp.app.model.TcocktailsXIngredient;
import com.webcocktailapp.repository.ICocktailsXIngredientRepository;
import com.webcocktailapp.service.ICocktailsXIngredientService;


@Service
public class ICocktailsXIngredientServiceImpl implements ICocktailsXIngredientService {
	
	@Autowired
	private ICocktailsXIngredientRepository cocktailsXIngredientService;


	@Override
	public List<TcocktailsXIngredient> findAllCocktailsIngredientIds(List<Long> ingredientIds) {
		
		
		return cocktailsXIngredientService.findAll()
		.stream()
		.filter(record -> ingredientIds.contains(record.getIngredient().getIngrediendId()))
		.distinct()
		.collect(Collectors.toList());
		
		
	}

}
