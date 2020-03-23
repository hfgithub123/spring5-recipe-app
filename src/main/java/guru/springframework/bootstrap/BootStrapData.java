package guru.springframework.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.domain.Difficulty;
import guru.springframework.domain.Recipe;
import guru.springframework.repositories.RecipeRepository;

@Component
public class BootStrapData implements CommandLineRunner {

	private RecipeRepository recipeRepository;
	
	public BootStrapData(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		final Recipe r1 = new Recipe();
		r1.setDescription("Perfect Guacamole");
		r1.setCookTime(1);
		r1.setDifficulty(Difficulty.EASY);
		recipeRepository.save(r1);

		final Recipe r2 = new Recipe();
		r2.setDescription("Spicy Grilled Chicken Tacos");
		r2.setCookTime(1);
		r2.setDifficulty(Difficulty.EASY);
		recipeRepository.save(r2);
	}
}
