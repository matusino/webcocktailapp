package com.webcocktailapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webcocktailapp.app.model.TCocktail;

public interface ICockatilRepository extends JpaRepository<TCocktail, Long> {

}
