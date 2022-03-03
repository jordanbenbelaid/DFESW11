package domain;

public class Pet {

	private String typePet;
	private String name;
	private int age;
	private String food;
	
	public Pet() {}

	public Pet(String typePet, String name, int age, String food) {
		super();
		this.typePet = typePet;
		this.name = name;
		this.age = age;
		this.food = food;
	}

	@Override
	public String toString() {
		return "\nPet: \ntypePet = " + typePet + "\nname = " + name + "\nage = " + age + "\nfood = " + food + "\n";
	}
	
	
}
