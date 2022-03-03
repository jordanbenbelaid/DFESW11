package vehicles;

public class Motorbike extends Vehicle{

	private int weightOfBike;

	public Motorbike(int id, int wheels, int doors, String colour, String vehicleMake, int weightOfBike) {
		super(id, wheels, doors, colour, vehicleMake);
		this.weightOfBike = weightOfBike;
	}

	public int getWeightOfBike() {
		return weightOfBike;
	}

	public void setWeightOfBike(int weightOfBike) {
		this.weightOfBike = weightOfBike;
	}

	@Override
	public double calculateBill() {
		double price = weightOfBike * 13;
		return price;
	}

	@Override
	public String toString() {
		return "Motorbike [weightOfBike=" + weightOfBike + ", getId()=" + getId() + ", getWheels()=" + getWheels()
				+ ", getDoors()=" + getDoors() + ", getColour()=" + getColour() + ", getVehicleMake()="
				+ getVehicleMake() + "]";
	}
	
}
