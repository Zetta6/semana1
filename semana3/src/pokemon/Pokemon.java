package pokemon;

public class Pokemon {
	
	private String name;
	private int healt;
	private String type;
	
	public Pokemon(String name2, int healt2, String type2) {
		
		setName(name2);
		setHealt(healt2);
		setType(type2);
		count ++;
	}

	public void attackPokemon (Pokemon pokemon) {
		pokemon.healt = pokemon.healt - 10;
		String nombre = pokemon.name;
		String atacante = getName();
		System.out.println (nombre + " ha sido atacado por " + atacante + " | Vida = " + pokemon.healt);
	}
	
	static int count = 0;
	
	//GETTER
	public String getName() {
		return name;
	}
	
	public int getHealt() {
		return healt;
	}
	
	public String getType() {
		return type;
	}
	
	
	//SETTER
	public void setName(String nombre) {
		this.name = nombre;
	}
	
	public void setHealt(int vida) {
		this.healt = vida;
	}
	
	public void setType(String tipo) {
		this.type = tipo;
	}

}
