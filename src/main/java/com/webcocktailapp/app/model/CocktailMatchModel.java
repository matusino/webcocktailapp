package com.webcocktailapp.app.model;

public class CocktailMatchModel {
	
	private String cocktailNameString;
	private String percentageMatch;
	private String url;
	
	
	public CocktailMatchModel(String cocktailNameString, String percentageMatch, String url) {
		super();
		this.cocktailNameString = cocktailNameString;
		this.percentageMatch = percentageMatch;
		this.url = url;
	}


	public CocktailMatchModel() {
		super();
		
	}


	public String getCocktailNameString() {
		return cocktailNameString;
	}


	public void setCocktailNameString(String cocktailNameString) {
		this.cocktailNameString = cocktailNameString;
	}


	public String getPercentageMatch() {
		return percentageMatch;
	}


	public void setPercentageMatch(String percentageMatch) {
		this.percentageMatch = percentageMatch;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cocktailNameString == null) ? 0 : cocktailNameString.hashCode());
		result = prime * result + ((percentageMatch == null) ? 0 : percentageMatch.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
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
		CocktailMatchModel other = (CocktailMatchModel) obj;
		if (cocktailNameString == null) {
			if (other.cocktailNameString != null)
				return false;
		} else if (!cocktailNameString.equals(other.cocktailNameString))
			return false;
		if (percentageMatch == null) {
			if (other.percentageMatch != null)
				return false;
		} else if (!percentageMatch.equals(other.percentageMatch))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
	
	
	

}
