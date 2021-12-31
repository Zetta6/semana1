package guardiazoologico;

public class Gorilla extends Mammal{

	
	public void throwSomething (int arrojar) {
		int energia = this.displayEnergy();
		int lanzar = 5 * arrojar;
		energyLevel = energia - lanzar;
		System.out.println("El gorila ha arrojado algo " + arrojar + " veces, Su nueva energía ahora es: " + energyLevel);
	}
	
	
	public void eatBananas (int eat) {
		int energia = this.displayEnergy();
		int banana = 10 * eat;
		energyLevel = energia + banana;
		System.out.println("El gorila ha comido " + eat + " bananas, su energía a subido y ahora es de : " + energyLevel);
	}
	
	
	
	public void climb () {
		int energia = this.displayEnergy();
		energyLevel = energia - 10;
		System.out.println("El gorila se a trepado a un arbol y su energía disminuyó 10 puntos, su energía actual es: " + energyLevel);
	}
}
