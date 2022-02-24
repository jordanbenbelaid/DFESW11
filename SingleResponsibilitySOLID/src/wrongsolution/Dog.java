package wrongsolution;

public class Dog {

	private String dogType;
	private String colour;
	private boolean isMale;
	
	public Dog(String dogType, String colour, boolean isMale) {
		super();
		this.dogType = dogType;
		this.colour = colour;
		this.isMale = isMale;
	}

	public String getDogType() {
		return dogType;
	}

	public void setDogType(String dogType) {
		this.dogType = dogType;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	
	public void speak() {
		System.out.println("Woof woof");
	}
	
	public void walk() {
		System.out.println("Lets go for a walk");
	}
	
	public void playCatch() {
		System.out.println("I got the ball!");
	}
	
}
