package demo;

public class Dog {

	//Attributes
	private String name;
	private String fluffiness;
	private String breed;
	private boolean isGoodDog;
	private int age;
	
	//default constructor - allows us to make an empty dog object if we want
	public Dog() {	}
	
	//All argument constructor
	public Dog(String name, String fluffiness, String breed, boolean isGoodDog, int age) {
		this.name = name;
		this.fluffiness = fluffiness;
		this.breed = breed;
		this.isGoodDog = isGoodDog;
		this.age = age;
	}
	
	public Dog(String name, String fluffiness, String breed) {
		this.name = name;
		this.fluffiness = fluffiness;
		this.breed = breed;
	}
	
	//getter and setter for the name attribute
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean getIsGoodDog() {
		return isGoodDog;
	}
	
	public void setIsGoodDog(boolean isGoodDog) {
		this.isGoodDog = isGoodDog;
	}
}
