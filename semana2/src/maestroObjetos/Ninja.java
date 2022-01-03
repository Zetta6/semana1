package maestroObjetos;

public class Ninja extends Human {

	{
	this.stealth = 10;
	this.intelligence = 8;
	}

	public void steal (Human victima) {
		int vidaVic = victima.health;
		victima.health = victima.health - stealth;
		int vidaAta = health;
		health = health + stealth;
		
		System.out.println(name + " le ha robado vida a su oponente (vida: " + vidaAta + " -> " + health + ")\n" );
		
		System.out.println("a " + victima.name + " le han arrebatado un poco de su escencia (vida: " + vidaVic + " -> " + victima.health + ")\n" );
	}
	
	public void runAway () {
		int vida = health;
		health = health - 10;
		
		System.out.println(name + " se ha esfumado en una bomba de humo (vida: " + vida + " -> " + health + ")\n");
		
	}
	
}
