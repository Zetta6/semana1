package cuentaBanco;

public class BankAccountTest {

	public static void main(String[] args) {
		
		BankAccount jose = new BankAccount();
		
		//IMPRIMIR NUMERO DE CUENTA
		
		jose.getnumAccount();
		
		//DEPOSITO EN AMBAS CUENTAS
		
		jose.depositarCA(200000.05);
		
		jose.depositarCC(500000.00);
		
		
		//REVISAR DINERO
		
		jose.getdineroCA();
		
		jose.getdineroCC();
		
		jose.getTotal();
		
		//RETIRAR EN AMBAS CUENTAS
		
		jose.retirarCA(50000.05);
		
		jose.retirarCC(100000);
		
		jose.retirarCA(600000); //retiro por sobre los fondos cuenta ahorro
		
		jose.retirarCC(1000000); //retiro por sobre los fondos cuenta corriente

	}

}
