package pokemon;

public class Pokedex extends AbstractPokemon {

	public int myPokemons = Pokemon.count;
	
	@Override
	public void listPokemon() {
		System.out.println(myPokemons + " Pokemon/es creado/s");
		
	}

}
