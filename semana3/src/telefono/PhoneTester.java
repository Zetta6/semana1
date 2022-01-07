package telefono;

public class PhoneTester {

	public static void main(String[] args) {

		Galaxy galaxy21 = new Galaxy("Samsung Galaxy S21", 80, "Dominic Toretto", "Over the Horizon");
		
		galaxy21.displayInfo();
		
		galaxy21.unlock();
		
		galaxy21.ring();
		
		System.out.println("--------------------------------------------------------");
		
		Iphone iphone13 = new Iphone("iPhone 13 Pro Max", 90, "Anuel", "Reflection");
		
		iphone13.displayInfo();
		
		iphone13.unlock();
		
		iphone13.ring();
		
		
	}

}
