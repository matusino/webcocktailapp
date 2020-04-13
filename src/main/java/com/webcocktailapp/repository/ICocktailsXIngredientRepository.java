package com.webcocktailapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webcocktailapp.app.model.TcocktailsXIngredient;

public interface ICocktailsXIngredientRepository extends JpaRepository<TcocktailsXIngredient, Long> {

}
