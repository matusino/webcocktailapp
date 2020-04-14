package com.webcocktailapp.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webcocktailapp.repository.IIngredientsRepository;

@Controller
public class IngredientController {
	
	@Autowired
	private final IIngredientsRepository iIngredientsRepository;
	
	

	public IngredientController(IIngredientsRepository iIngredientsRepository) {
		super();
		this.iIngredientsRepository = iIngredientsRepository;
	}



	@RequestMapping(value = "/ingredients")
	public String getIngredients(Model model) {
		
		model.addAttribute("ingredients",  iIngredientsRepository.findAll());
		
		return "ingredients";
		
	}

	
}
