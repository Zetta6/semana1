package cuentaBanco;

import java.util.Random;

public class BankAccount {

	private String numAccount;
	private double saldoCC;
	private double saldoCA;
	
	static int accounts;
	static String dineroG;
	
	//Generar numero de cuenta aleatorio
	private String number () {
		Random random = new Random();
		String cuenta = " ";
		for (int i = 1; i <=10; i++) {
			int number = random.nextInt(10);
			cuenta = cuenta + number;
		}
		return cuenta;
	}
	
	//Metodo constructor
	public BankAccount () {
		numAccount = number();
		accounts ++;
	}
	
	//GET y SET para el dinero de las cuentas ahorro y corriente.
	public double getdineroCC() {
		return saldoCC;
	}
	
	public double getdineroCA() {
		return saldoCA;
	}
	
	public void setdineroCC(double dinero) {
		this.saldoCC = dinero;
	}
	
	public void setdineroCA(double dinero) {
		this.saldoCA = dinero;
	}
	
	public void getnumAccount() {
		System.out.println("Número de cuenta:" + this.numAccount+ "\n-----------------------------------");
	}
	
	//RETIRAR DINERO
	
	public void retirarCC(double dinero) {  //CUENTA CORRIENTE
		double fondo = getdineroCC();
		if (fondo < dinero) {
			System.out.println("Fondos insuficientes\n");
		} else {
			double saldo = fondo - dinero;
			setdineroCC(saldo);
			System.out.println("Usted ha hecho un retiro por " + dinero + "$ en su cuenta corriente. Su saldo actual de " + getdineroCC() + "$\n");
		}
	}
	
	public void retirarCA(double dinero) {  //CUENTA AHORRO
		double fondo = getdineroCA();
		if (fondo < dinero) {
			System.out.println("Fondos insuficientes\n");
		} else {
			double saldo = fondo - dinero;
			setdineroCA(saldo);
			System.out.println("Usted ha hecho un retiro por " + dinero + "$ en su cuenta de ahorros. Su saldo actual de " + getdineroCA() + "$\n");
		}
	}
	
	
	//DEPOSITAR DINERO
	
	public void depositarCC(double dinero) {  //CUENTA CORRIENTE
		double fondo = getdineroCC();
		double saldo = fondo + dinero;
		setdineroCC(saldo);
		System.out.println("Haz realizado un deposito por " + dinero + "$ en su cuenta corriente. Su saldo actual es de " + getdineroCC() + "$\n");
	}
	
	public void depositarCA(double dinero) {  //CUENTA AHORRO
		double fondo = getdineroCA();
		double saldo = fondo + dinero;
		setdineroCA(saldo);
		System.out.println("Haz realizado un deposito por " + dinero + "$ en su cuenta de ahorros. Su saldo actual de " + getdineroCA() + "$\n");
	}
	
	
	//DINERO TOTAL DE AMBAS CUENTAS
	
	public void getTotal() {
		double CA = getdineroCA();
		double CC = getdineroCC();
		double total = CC + CA;
		System.out.println("Sus fondo actuales poseen en su totalidad " + total + "$\n");
	}
	

}
