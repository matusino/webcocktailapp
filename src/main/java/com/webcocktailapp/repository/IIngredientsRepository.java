package com.webcocktailapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webcocktailapp.app.model.TIngredient;

public interface IIngredientsRepository extends JpaRepository<TIngredient, Long>{

}
