package pokemon;

public abstract class PokeTest {

	public static void main(String[] args) {
		
		Pokemon pikachu = new Pokemon("Pikachu", 100, "Electrico");
		Pokemon charizard = new Pokemon("Charizard", 200, "Fuego");
		Pokemon greninja = new Pokemon("Greninja", 150, "Agua");
		
		
		//BATALLA POKEMON
		charizard.attackPokemon(greninja);
		greninja.attackPokemon(pikachu);
		pikachu.attackPokemon(charizard);
		
		System.out.println ("---------------------------------------------------------");
		
		//POKEDEX
		
		Pokedex pokedex = new Pokedex ();
		
		pokedex.listPokemon();
		
		
	}

}
