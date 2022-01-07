package calculadora;

public class CalculatorTest {

	public static void main(String[] args) {

		Calculator problema1 = new Calculator();
		
		problema1.performOperation(10.6);
		
		problema1.performOperation("+");
		
		problema1.performOperation(5.2);
		
		problema1.performOperation("*");
		
		problema1.performOperation(10);
		
		problema1.performOperation("/");
		
		problema1.performOperation(2);
		
		
		problema1.getResults();
		
		
	}

}
