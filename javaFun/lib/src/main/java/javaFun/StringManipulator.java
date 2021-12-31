package javaFun;

public class StringManipulator {
	
	//Metodo trim
	String trimAndConcat(String string, String string2) {
		
		String trim = string.trim() + string2.trim();
		return trim;
	}
	
	//Metodo indexof
	int getIndexOrNull(String string, char Char) {
		
		int index = string.indexOf(Char);
		return index;
	}
	
	//Metodo indexof 2
	int getIndexOrNull2(String string1, String string2) {
		
		int index = string1.indexOf(string2);
		return index;
	}
	
	//Metodo Substring
	String concatSubstring(String string1, int Int1, int Int2, String string2) {
		
		String substring1 = string1.substring(Int1,Int2);
		String concat = substring1.concat(string2);
		return concat;
	}

	public static void main(String[] args)  {
		
		//Concatenar Hola Mundo
		System.out.println("\n Actividad 1");
		
		StringManipulator manipulator = new StringManipulator();

		String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");

		System.out.println(str); // HolaMundo 
		
		
		//Obtener el indice del caracter pedido
		System.out.println("\nActividad 2");
		
		StringManipulator manipulator1 = new StringManipulator();

		char letter = 'n';

		int a = manipulator1.getIndexOrNull("NTT Data", letter);

		int b = manipulator1.getIndexOrNull("Hola Mundo", letter);

		int c = manipulator1.getIndexOrNull("Saludar", letter);

		System.out.println(a);

		System.out.println(b);

		System.out.println(c);

		
		//Obtener el indice donde comienza la subcadena
		System.out.println("\nActividad 3");
		
		StringManipulator manipulator2 = new StringManipulator();

		String word = "Hola";

		String subString = "la";

		String notSubString = "mundo";

		int a2 = manipulator2.getIndexOrNull2(word, subString);

		int b2 = manipulator2.getIndexOrNull2(word, notSubString);

		System.out.println(a2); // 2

		System.out.println(b2); // -1
		
		
		//Obetener una subcadena utilizando un indice de inicio y un indice de finalización
		System.out.println("\nActividad 4");
		
		StringManipulator manipulator3 = new StringManipulator();

		String word2 = manipulator3.concatSubstring("Hola", 1, 3, "mundo");

		System.out.println(word2); // olmundo


	}
}
