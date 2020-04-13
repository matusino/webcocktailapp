package com.webcocktailapp.app.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "t_cocktails_x_ingredients", schema = "co")
public class TcocktailsXIngredient implements Serializable {
	
	@EmbeddedId
	private CocktailIngredientId id;
	
	@ManyToOne
	@MapsId("cocktail_id")
	@JoinColumn(name = "cocktail_id", nullable = false)
	private TCocktail cocktail;
	
	@ManyToOne
	@MapsId("ingrediend_id")
	@JoinColumn(name = "ingrediend_id", nullable = false)
	private TIngredient ingredient;

	public TcocktailsXIngredient() {
		super();
	
	}

	public CocktailIngredientId getId() {
		return id;
	}

	public void setId(CocktailIngredientId id) {
		this.id = id;
	}

	public TCocktail getCocktail() {
		return cocktail;
	}

	public void setCocktail(TCocktail cocktail) {
		this.cocktail = cocktail;
	}

	public TIngredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(TIngredient ingredient) {
		this.ingredient = ingredient;
	}
	
	
	
	

}
