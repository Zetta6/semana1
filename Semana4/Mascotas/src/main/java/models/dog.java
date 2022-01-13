package models;

public class dog extends animal implements pet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public dog(String name, String breed, int weight) {
		super(name, breed, weight);
	}

	@Override
	public String showAffection() {
		String afecto;
		if (super.getWeight() < 30) {
			afecto = super.getName() + " se ha subido en tu regazo";
		} else {
			afecto = super.getName() + " se está acurrucando a tu lado";
		}
		return afecto;
	}
	
}
