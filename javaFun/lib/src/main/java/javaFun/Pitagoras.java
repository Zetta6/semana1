package javaFun;

public class Pitagoras {
	
	public static void main (String[] args){
		
		double catetoA = 5;
		double catetoB = 8;
		
		double hipotenusa = Math.sqrt(Math.pow(catetoA, 2)) + Math.sqrt(Math.pow(catetoB, 2));
		
		System.out.print(hipotenusa);

    }
}
