package guardiazoologico;

public class Bat extends Mammal{

	{this.energyLevel = 300;}
	
	public void fly (int fly) {
		int energia = this.displayEnergy();
		energyLevel = energia - 50 ;
		System.out.println("pat pat pat | la energ�a a disminuido 50 puntos, la energ�a actual del murcielago es: " + energyLevel);
	}
	
	
	public void eatHumans (int eat) {
		int energia = this.displayEnergy();
		int human = 25 * eat;
		energyLevel = energia + human;
		System.out.println("Vaya eso fue... inesperado. Bueno, no importa. La energ�a ahora es : " + energyLevel);
	}
	
	
	
	public void attacktown (int attack) {
		int energia = this.displayEnergy();
		int destruir = 100 * attack;
		energyLevel = energia - destruir;
		System.out.println("persona x: ��NO PUEDE SER, MI HIJA!! ����QUE LE HACEN A MI HIJA?!!??" +
							"\n persona x2: ��DIOS MIIIOOO!!" +
							"\n ni�o x: ��Mam�aa...!! quiero a mi mam�a... *llora*" +
							"\n persona con complejo de heroe: ��No se preocupen!!, yo los salvare *salta a la acci�n y es comido vivo*" +
							"\n\n .... \n\n Vaya... estem *silencio incomodo*. Parece que nuestro amigo el murcielago \n "
							+ "ahora a disminuido su energ�a " + destruir + " puntos, por lo que su energ�a ahora es de " + energyLevel +
							"\n ahora si me disculpan, hire a un bunquer de supervivensia.");
		if (energyLevel == 0) {
			System.out.println("��RAPIDO CORRAN!! antes de que recargue sus energ�as");
		}
	}
}