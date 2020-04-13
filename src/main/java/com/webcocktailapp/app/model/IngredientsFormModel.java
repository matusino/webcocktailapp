package com.webcocktailapp.app.model;

import java.util.Arrays;

public class IngredientsFormModel {

	private Long[] ingredientId;

	public IngredientsFormModel() {
		super();
	
	}

	public Long[] getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(Long[] ingredientId) {
		this.ingredientId = ingredientId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(ingredientId);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IngredientsFormModel other = (IngredientsFormModel) obj;
		if (!Arrays.equals(ingredientId, other.ingredientId))
			return false;
		return true;
	}
	
	
	
}
