package maestroObjetos;

public class Human {
	
	public int strength 	= 3;
	public int stealth 		= 3;
	public int intelligence = 3;
	public int health 		= 100;
	public String name;
	
	
	public void attack(Human victima) {
		int vida = (int) victima.health;
		victima.health = victima.health - strength;
		System.out.println(victima.name + " ha recibido algo de daño (vida: " + vida + " -> " + victima.health + ")\n");
		
	}
}
