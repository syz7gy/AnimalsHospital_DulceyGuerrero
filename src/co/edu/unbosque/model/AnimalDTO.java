package co.edu.unbosque.model;

public class AnimalDTO {
	
	private String name;
	private String species;
	private int age;
	
	public AnimalDTO() {
		
	}

	public AnimalDTO(String name, String species, int age) {
		super();
		this.name = name;
		this.species = species;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nName: " + name);
		sb.append("\nSpecies: " + species);
		sb.append("\nAge: " + age + "\n");
		return sb.toString();
	}

	
}
