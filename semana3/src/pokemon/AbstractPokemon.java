package pokemon;

public abstract class AbstractPokemon implements PokemonInterface {


	@Override
	public Pokemon createPokemon(String name, int healt, String type) {
		Pokemon pokemon = new Pokemon(name, healt, type);
		return pokemon;
	}

	@Override
	public String pokemonInfo(Pokemon pokemon) {
		String nombre = pokemon.getName();
		int vida = pokemon.getHealt();
		String tipo = pokemon.getType();
		Pokemon.count ++;
		String texto = "Pokemon: " + nombre + "\nTipo: " + tipo + "\nVida: " + vida;
		return texto + nombre;
	}	

}
