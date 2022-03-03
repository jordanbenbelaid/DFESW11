package vehicles;

public class Car extends Vehicle{
	
	private int exhausts;
	private boolean hasBluetooth;

	
	public Car(int id, int wheels, int doors, String colour, String vehicleMake, int exhausts, boolean hasBluetooth) {
		super(id, wheels, doors, colour, vehicleMake);
		this.exhausts = exhausts;
		this.hasBluetooth = hasBluetooth;
	}

	public int getExhausts() {
		return exhausts;
	}

	public void setExhausts(int exhausts) {
		this.exhausts = exhausts;
	}

	public boolean isHasBluetooth() {
		return hasBluetooth;
	}

	public void setHasBluetooth(boolean hasBluetooth) {
		this.hasBluetooth = hasBluetooth;
	}

	@Override
	public double calculateBill() {
		double price = exhausts * 15.99;
		return price;
	}

	@Override
	public String toString() {
		return "Car [exhausts=" + exhausts + ", hasBluetooth=" + hasBluetooth + ", getId()=" + getId()
				+ ", getWheels()=" + getWheels() + ", getDoors()=" + getDoors() + ", getColour()=" + getColour()
				+ ", getVehicleMake()=" + getVehicleMake() + "]";
	}

}
