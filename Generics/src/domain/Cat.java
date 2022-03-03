package domain;

public class Cat {

	private String colour;

	public Cat(String colour) {
		super();
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Cat [colour=" + colour + "]";
	}
	
}
