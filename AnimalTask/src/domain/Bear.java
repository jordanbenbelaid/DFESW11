package domain;

public class Bear extends Animal{

	private String type;
	private int weight;
	
	
	public Bear(String food, String habitat, int age, String type, int weight) {
		super(food, habitat, age);
		this.type = type;
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public void sleep() {
		System.out.println("I like to sleep");	
	}

	@Override
	public void breeding() {
		System.out.println("I have kids");	
	}
	
	public void attack() {
		System.out.println("I only attack when I am hungry");
	}

	@Override
	public String toString() {
		return "Bear [type=" + type + ", weight=" + weight + ", food()=" + getFood() + ", habitat()="
				+ getHabitat() + ", age()=" + getAge() + "]";
	}

	@Override
	public void speed() {
		System.out.println("I am speed");
	}

	@Override
	public void life() {
		System.out.println("I live for like 15 years");
	}
	
	
	
	
}
