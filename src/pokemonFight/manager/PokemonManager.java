package pokemonFight.manager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import pokemonFight.controller.PokemonController;
import pokemonFight.manager.pojo.Pokemon;

public class PokemonManager {

	private List<Pokemon> eligiblePokemon = new ArrayList<Pokemon>(); 
	
	public PokemonManager() throws IOException {
		eligiblePokemon = new PokemonController().loadPokemons();
	}
	
	public List<Pokemon> getPokemons(){
		return eligiblePokemon;
	}
	
}
