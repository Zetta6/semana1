package javaFun;

import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

public class PuzzleJava {
	
	 //(Metodo 1) Suma de array
	static ArrayList<Integer> sumarNumeros(int[] numeros) {
		int suma = 0;
		ArrayList<Integer> mayores = new ArrayList<Integer>();
		
		for(int i = 0; i < numeros.length; i++) {
			suma = numeros[i] + suma;
			if(numeros[i] > 10) {
				mayores.add(numeros[i]);
			}
		}
		System.out.println("La suma de los números es: " + suma);
		return mayores;
	}

	
	//(Metodo 2) Nombres
	static ArrayList<String> mezclaFiltro(ArrayList<String> nombres) {

		ArrayList<String> filtro = new ArrayList<String>();
		for(int i = 0; i < nombres.size(); i++) {
			String elemento = nombres.get(i);
			int length = elemento.length();
			if(length > 5) {
				filtro.add(elemento);
			}
		}
		Collections.shuffle(nombres);
		System.out.println("Nombres mezclados: " + nombres);
		return filtro;
	}
	
		
	public static void main(String[] args) {
		
		
		/*Crear un arreglo con los siguientes valores: 3,5,1,2,7,9,8,13,25,32. Imprimir la suma de 
		todos los números en el arreglo. El método también debe retornar un arreglo que incluya solo 
		los números que son mayores a 10 (Por ejemplo cuando envía el arreglo anterior, debe retornar un 
		arreglo con los valores de 13,25,32)*/
		System.out.println("Ejericio 1" + "\n");
		
		int [] numeros = {3,5,1,2,7,9,8,13,25,32};
		System.out.println("Los valores del array son: " + Arrays.toString(numeros));
		ArrayList<Integer> respuesta = sumarNumeros(numeros);
		System.out.println("Los números mayores a 10 son: " + respuesta);
		
		
		
		
		
		/*Crear un arreglo con los siguientes valores: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
		Mezcle el arreglo e imprima el nombre de cada persona. Haga que el método también devuelva un 
		arreglo con los nombres que tienes más de 5 caracteres.*/
		System.out.println("\n\n\n\n" + "Ejericio 2" + "\n");
		
		ArrayList<String> nombres = new ArrayList<String>();
		nombres.add("Nancy");
		nombres.add("Jinichi");
		nombres.add("Fujibayashi");
		nombres.add("Momochi");
		nombres.add("Ishikawa");
		System.out.println("Nombres: " + nombres);
		
		ArrayList<String> carac5 = mezclaFiltro(nombres);
		System.out.println("Nombres de mas de 5 caracteres: " + carac5);
		
		
		
		
		
		/*Crear un arreglo que contiene las 26 letras del alfabeto (este arreglo debe tener 26 valores). 
		Mezcle el arreglo y, después de mezclarlo, imprima la última letra del arreglo. También debe 
		imprimir la primera letra del arreglo. Si la primera letra del arreglo es una vocal, haga que 
		muestre un mensaje.*/
		System.out.println("\n\n\n\n" + "Ejericio 3" + "\n");
		
		ArrayList<String> alfabeto = new ArrayList<String>();
		alfabeto.add("A");   	alfabeto.add("B");
		alfabeto.add("C");		alfabeto.add("D");
		alfabeto.add("E");		alfabeto.add("F");
		alfabeto.add("G");		alfabeto.add("H");
		alfabeto.add("I");		alfabeto.add("J");
		alfabeto.add("K");		alfabeto.add("L");
		alfabeto.add("M");		alfabeto.add("N");
		alfabeto.add("O");		alfabeto.add("P");
		alfabeto.add("Q");		alfabeto.add("R");
		alfabeto.add("R");		alfabeto.add("T");
		alfabeto.add("U");		alfabeto.add("V");
		alfabeto.add("W");		alfabeto.add("X");
		alfabeto.add("Y");		alfabeto.add("Z");
		
		Collections.shuffle(alfabeto); if(alfabeto.get(0) == "A" || alfabeto.get(0) == "E" || alfabeto.get(0)== "I" ||
					alfabeto.get(0) == "O" || alfabeto.get(0) == "U") {
				System.out.println("La primera letra es: " + alfabeto.get(0) + " (esta letra es una vocal)");
			} else {
				System.out.println("La primera letra es: " + alfabeto.get(0));
			}
			
		System.out.println("La ultima letra es: "+ alfabeto.get(25));
		
		
		
		
		
		/*Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100.*/
		System.out.println("\n\n\n\n" + "Ejericio 4" + "\n");
		
		int numRandom[] = new int [10];
		for(int i = 0; i < numRandom.length; i++) {
			numRandom[i] = (int)(Math.random()*(55-100)+100);
			
			System.out.println(numRandom[i]);
		}
		
		
		
		
		
		/*Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100 y hacer que estén 
		ordenados (mostrar el número más pequeño en el principio del arreglo). Imprimir todos los 
		números del arreglo. Luego, Imprimir el valor mínimo del arreglo, así como el valor máximo.*/
		System.out.println("\n\n\n\n" + "Ejericio 5" + "\n");
		
		ArrayList<Integer> numRandom2 = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			int randomNum = (int)(Math.random()*(55-100)+100);
			numRandom2.add(randomNum);
		}
		
		Collections.sort(numRandom2);
		System.out.println(numRandom2);
		System.out.println("Valor minimo y valor maximo: " + numRandom2.get(0) + ", " + numRandom2.get(9));
	
	
	
	
	
		/*Crear una cadena aleatoria con 5 caracteres de longitud.*/
		System.out.println("\n\n\n\n" + "Ejericio 6" + "\n");
		
		String base = "Electroencefalografista";
		char [] caracteres = new char[5];
		String cadRandom = "";
		Random r = new Random();
		
		for(int i = 0; i < 5; i++) {
			caracteres[i] = base.charAt(r.nextInt(base.length()));		
		}
		
		for(int i = 0; i < caracteres.length; i++) {
			cadRandom = cadRandom + caracteres[i];
		}
		System.out.println("Caracteres random: " + cadRandom);
		
		
		
		
		
		/*Generar un arreglo con 10 cadenas aleatorias y cada una con 5 caracteres de longitud.*/
		System.out.println("\n\n\n\n" + "Ejericio 7" + "\n");
		
		
	}
}
