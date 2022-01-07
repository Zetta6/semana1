package pokemon;

public interface PokemonInterface {

	Pokemon createPokemon(String name, int healt, String type);
	
	String pokemonInfo(Pokemon pokemon);
	
	void listPokemon();
	
}
