package maestroObjetos;

public class Wizard extends Human {
	
	{
	this.health = 50;
	this.intelligence = 8;
	}

	public void heal (Human victima) {
		int vida = victima.health;
		victima.health = victima.health + intelligence;
		
		System.out.println(victima.name + " ha sido curado por " + name + " (vida: " + vida + " -> " + victima.health + ")\n" );
		
	}
	
	public void fireball (Human victima) {
		int vida = victima.health;
		victima.health = victima.health - (intelligence * 3);
		
		System.out.println(victima.name + " ha sido envuelto en llamas (vida: " + vida + " -> " + victima.health + ")\n");
		
	}
	
}
