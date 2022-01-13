package models;

public class animal implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	
	private String breed;
	
	private int weight;
	
	//CONSTRUCTOR
	public animal(String name, String breed, int weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	
	//METODOS NAME
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	//METODOS BREED
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	
	//METODOS WEIGHT
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
}
