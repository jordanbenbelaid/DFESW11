package demo;

public class Tiger extends Animals {

	private boolean isPredator;

	//Constructor using attributes from the superclass (parent class)
	public Tiger(String food, int numOfLegs, boolean isPredator) {
		super(food, numOfLegs);
		this.isPredator = isPredator;
	}

	public boolean isPredator() {
		return isPredator;
	}

	public void setPredator(boolean isPredator) {
		this.isPredator = isPredator;
	}

	@Override
	public String toString() {
		return "Tiger [isPredator=" + isPredator + ", getFood()=" + getFood() + ", getNumOfLegs()=" + getNumOfLegs()
				+ "]";
	}
	
	@Override
	public void eat() {
		System.out.println("I eat other animals");
	}

}
