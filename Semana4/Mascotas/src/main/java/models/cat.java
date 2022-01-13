package models;

public class cat extends animal implements pet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public cat(String name, String breed, int weight) {
		super(name, breed, weight);
	}

	@Override
	public String showAffection() {
		String afecto = super.getName() + " te mira fijamente";
		return afecto;
	}
	
}
