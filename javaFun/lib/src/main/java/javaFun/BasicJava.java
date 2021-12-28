package javaFun;

import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {

	public static void main(String[] args) {
	
		//Imprimir 1 - 255
		System.out.println("Imprimir 1 - 255");
		
		int [] num1 = new int [256];
		
		for (int i=1 ; i <= 255 ; i++) {
			num1 [i] = i;
			System.out.println(num1 [i]);
		}

		//Imprimir números impares entre 1 - 255
		System.out.println("\n" + "Imprimir números impares entre 1 - 255");
				
		int [] num2 = new int [256];
		
		for (int i=1 ; i <= 255 ; i++) {
			num2 [i] = i;
			if (num2 [i] % 2 != 0) {	
				System.out.println(num2[i]);
			}
		}
		
		//Imprimir la suma
		System.out.println("\n" + "Imprimir la suma");
		
		int suma1 = 0;
		
		for (int i=0 ; i <= 255 ; i++) {
			suma1 = i + suma1;
			System.out.println("Nuevo número: " + i + " " + "suma: " + suma1);
		}
		
		//Recorre un arreglo
		System.out.println("\n" + "Recorrer un arreglo");
		
		int [] x = {1,3,5,7,9,13};
		
		for (int i=0 ; i < x.length ; i++) {
			System.out.println(x[i]);
		}
		
		//Encontrar el Máximo
		System.out.println("\n" + "Encontrar el máximo");
		
		int[] x2 = {-3,-5,-7,-8,-4,-2};
		int max = x2[0];
 
		for(int i = 0; i < x2.length; i++){
			if(max < x2[i])
			{
				max=x2[i];
			}
		}
		System.out.println("El máximo es " + max);
		
		//Obtener el promedio
		System.out.println("\n" + "Obtener el promedio");
		
		int[] num4 = {2,10,3};
		int suma2 = 0;
		int prom;
		
		for(int i=0 ; i < num4.length ; i++) {
			suma2 = num4[i] + suma2;
		}
		prom =suma2 / num4.length;
		System.out.println("El promedio es: " + prom);
		
		//Arreglo de números impares
		System.out.println("\n" + "Arreglo de números impares");
		
		ArrayList<Integer> y = new ArrayList <Integer>();
		
		for(int i=0 ; i <= 255 ; i++) {
			if (i % 2 != 0) {
				y.add(i);
			}
		}
		System.out.println(y);
		
		//Mayor que Y
		System.out.println("\n" + "Mayor que Y");
		
		int[] num5 = {1,3,5,7};
		int y2 = 3;
		int result = 0;
		
		for(int i=1 ; i < num5.length ; i++)
		if(num5[i] > y2) {
			result = result + 1;	
		}
		System.out.println(result);
		
		//Valores al cuadrado
		System.out.println("\n" + "Valores al cuadrado");
		
		int[] x3 = {1,5,10,-2};
		
		for(int i = 0 ; i < x3.length ; i++) {
			x3[i] = x3[i] * x3[i];
			System.out.println(x3[i]);
		}
		
		//Eliminar números negativos
		System.out.println("\n" + "Eliminar números negativos");
		
		int[] x4 = {1,5,10,-2};
		
		for(int i = 0 ; i < x4.length ; i++) {
			if(x4[i] < 0) {
				x4[i] = 0;
			}
			System.out.println(x4[i]);
		}
	
		//Mínimo, Máximo y Promedio
		System.out.println("\n" + "Mínimo, Máximo y Promedio");
		
		int[] x5 = {1,5,10,-2};
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		int max1 = 0, min1 = 0, suma3 = 0, prom1;
		
		for(int i = 0 ; i < x5.length ; i++) {
			suma3 = x5[i] + suma3;
			if(max1 < x5[i]) {
				max1 = x5[i];
			}
			if(min1 > x5[i]) {
				min1 = x5[i];
			}	
		}
		prom1= suma3 / x5.length;
		resultado.add(min1);
		resultado.add(max1);
		resultado.add(prom1);
		System.out.println(resultado);
		
		//Cambiando los valores del arreglo
		System.out.println("\n" + "Cambiando los valores del arreglo");
		
		int [] x6 = {1,5,10,7,-2};
		int narray;
		System.out.println("antes: " + Arrays.toString(x6));

		for (int i = 0; i < x6.length; i++) {
			narray = i+1;
			if(narray >= x6.length) {
				x6[i] = x6[i] +2;	
			} else {
				x6[i] = x6[narray];
			}
		}
		System.out.println("despues: " + Arrays.toString(x6));
	}
}
