package maestroObjetos;

public class HumanTest {

	public static void main(String[] args) {
		
		Wizard Rasmodius = new Wizard();
		Rasmodius.name = "Rasmodius";
		
		Samurai Kinawa = new Samurai();
		Kinawa.name = "Kinawa";
		
		Ninja Blaze = new Ninja();
		Blaze.name = "Blaze";
		
		Kinawa.attack(Blaze);
		
		Blaze.runAway();
		
		Rasmodius.heal(Blaze);
		
		Rasmodius.fireball(Kinawa);
		
		Kinawa.attack(Blaze);
		
		Blaze.steal(Kinawa);
		
		Kinawa.deathBlow(Rasmodius);
		
		Blaze.runAway();
		
		Kinawa.meditate();
		
		Blaze.steal(Kinawa);
		
		Kinawa.deathBlow(Blaze);

	}

}
