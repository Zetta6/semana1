package maestroObjetos;

public class Samurai extends Human{

	{
	this.health = 200;
	}

	public void deathBlow (Human victima) {
		int vidaVic = victima.health;
		victima.health = victima.health - victima.health;
		int vidaAta = health;
		health = health / 2;
		
		System.out.println(name + " Ha aniquilado a " + victima.name + "(vida: " + vidaAta + " -> " + health + ")\n" );
		
		System.out.println(victima.name + " ha sido ELIMINADO por " + name + "(vida: " + vidaVic + " -> " + victima.health + ")\n" );
	}
	
	public void meditate () {
		int vida = health;
		health = health + (health / 2);
		
		System.out.println(name + " ha encontrado paz interior (vida: " + vida + " -> " + health + ")\n");
		
	}
	
}
