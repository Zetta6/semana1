package guardiazoologico;

public class Mammal {
	
	public int energyLevel = 100;
	
	
	public int displayEnergy () {
		System.out.println("La energ�a actual es de: " + energyLevel);
		return energyLevel;
	}
}
