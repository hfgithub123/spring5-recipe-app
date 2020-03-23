package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.repositories.RecipeRepository;

@Controller
public class RecipeController {

	private RecipeRepository recipeRepository;

	public RecipeController(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}
	
	@RequestMapping("/recipes")
	public String getRecipes(Model model) {
		
		model.addAttribute("recipes", recipeRepository.findAll());
		
		return "recipes/list";
	}
}
