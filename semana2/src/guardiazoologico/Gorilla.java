package guardiazoologico;

public class Gorilla extends Mammal{

	
	public void throwSomething (int arrojar) {
		int energia = this.displayEnergy();
		int lanzar = 5 * arrojar;
		energyLevel = energia - lanzar;
		System.out.println("El gorila ha arrojado algo " + arrojar + " veces, Su nueva energ�a ahora es: " + energyLevel);
	}
	
	
	public void eatBananas (int eat) {
		int energia = this.displayEnergy();
		int banana = 10 * eat;
		energyLevel = energia + banana;
		System.out.println("El gorila ha comido " + eat + " bananas, su energ�a a subido y ahora es de : " + energyLevel);
	}
	
	
	
	public void climb () {
		int energia = this.displayEnergy();
		energyLevel = energia - 10;
		System.out.println("El gorila se a trepado a un arbol y su energ�a disminuy� 10 puntos, su energ�a actual es: " + energyLevel);
	}
}
