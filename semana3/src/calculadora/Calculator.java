package calculadora;

import java.util.ArrayList;

public class Calculator implements java.io.Serializable{

	private double operandOne;
	private String operation;
	private String operationF;
	private double operandTwo;
	ArrayList <Double> suma = new ArrayList <Double>();
	ArrayList <Double> resta = new ArrayList <Double>();
	ArrayList <Double> multiplicar = new ArrayList <Double>();
	ArrayList <Double> dividir = new ArrayList <Double>();
	
	//SETTERS
	public void setOperandOne(int operandOne) {
		this.operandOne = operandOne;
	}
	
	public void setOperandTwo(int operandTwo) {
		this.operandTwo = operandTwo;
	}
	
	//OPERACIÓN
	public void performOperation (String operacion) {
		if (operacion == "+") {
			this.operation = operacion;
		} else if (operacion == "-") {
			this.operation = operacion;
		} else if (operacion == "=") {
			this.operation = operacion;
		} else if (operacion == "/") {
			this.operation = operacion;
		} else if (operacion == "*") {
			this.operation = operacion;
		} else {
			System.out.println("Operación no valida");
		}
	}

	//NÚMEROS
	public void performOperation(double variable) {
		if (operandOne == 0) {
			operandOne = variable;
		} if (operandOne != 0) {
			operandTwo = variable;
			//EN CASO DE UNA SUMA
		} if (operation == "+") { 
			suma.add(operandOne);
			operandOne = operandTwo;
			operationF = "+";
			//EN CASO DE UNA RESTA
		} if (operation == "-") {  
			resta.add(operandTwo);
			operandOne = operandTwo;
			operationF = "-";
			//EN CASO DE UN MULTIPLICACIÓN
		} if (operation == "*") {  
			multiplicar.add(operandOne);
			multiplicar.add(operandTwo);
			operandOne = operandTwo;
			operationF = "*";
			//EN CASO DE UNA DIVISIÓN
		} if (operation == "/") {  
			dividir.add(operandTwo);
			operandOne = operandTwo;
			operationF = "/";
			//PARA CULMINAR EL CALCULO EN CASO DE UNA SUMA
		} if (operation == "=" && operationF =="+") {  
			suma.add(operandOne);
			//PARA CULMINAR EL CALCULO EN CASO DE UNA MULTIPLICACIÓN
		} if (operation == "=" && operationF == "*") {
			//PARA CULMINAR EL CALCULO EN CASO DE UNA DIVISIÓN
		} if (operation == "=" && operationF == "/") {
			//PARA CULMINAR EL CALCULO EN CASO DE UNA RESTA
		}	 if (operation == "=" && operationF =="-") {  
			resta.add(operandOne);
		}
	}
	
	public void getResults() {
		double sumatotal = 0;
		for(int i = 0; i < suma.size(); i++) {
			sumatotal = (double) (suma.get(i) + sumatotal);
		}
		
		double restatotal = 0;
		for(int i = 0; i < resta.size(); i++) {
			restatotal = (double) (resta.get(i) + restatotal);
		}
		
		double multiplicacion = 1;
		for(int i = 0; i < multiplicar.size(); i++) {
			multiplicacion = (double) (multiplicar.get(i) * multiplicacion);
		}
		
		double division = 1;
		for(int i = 0; i < dividir.size(); i++) {
			division = (double) (dividir.get(i) * division);
		}
		
		double resultado = sumatotal +  multiplicacion - restatotal;
		double resultado1 = resultado / division;
		System.out.println("Resultado: " + resultado1);
		
		operationF = null;
	}
}
