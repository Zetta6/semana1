package javaFun;

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		int num;
		
		for (int i = 1; i <= 100; i++) {
			num = i;
			System.out.println(fizzBuzz(num) + "\n");
		
	}
}
	public static String fizzBuzz(int numero) {
			
			if(numero % 3 == 0 && numero % 5 == 0) {
				return "FizzBuzz";
			} else if (numero % 3 == 0) {
				return "Fizz";
			} else if (numero % 5 == 0) {
				return "Buzz";
			} else {
				return String.valueOf(numero);
		}
	}
}