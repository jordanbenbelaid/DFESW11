package demo;

public class Animals {

	private String food;
	private int numOfLegs;
	
	public Animals() {}
	
	public Animals(String food, int numOfLegs) {
		super();
		this.food = food;
		this.numOfLegs = numOfLegs;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public int getNumOfLegs() {
		return numOfLegs;
	}

	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}
	
	public void eat() {
		System.out.println("I eat food");
	}
	
	public static void tester() {
		System.out.println("I belong to the type, not the instance!");
	}

	@Override
	public String toString() {
		return "Animals [food=" + food + ", numOfLegs=" + numOfLegs + "]";
	}
	
	
}
