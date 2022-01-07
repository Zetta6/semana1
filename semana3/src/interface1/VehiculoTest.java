package interface1;

public class VehiculoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto ferrari = new Auto();
		System.out.println(ferrari.acelerar());

		Moto bera = new Moto();
		System.out.println(bera.acelerar());
		
		System.out.println(ferrari.fechaCreacion());

	}

}
