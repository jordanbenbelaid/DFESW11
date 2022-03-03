package vehicles;

public abstract class Vehicle {

		private int id;
		private int wheels;
		private int doors;
		private String colour;
		private String vehicleMake;
		
		public Vehicle(int id, int wheels, int doors, String colour, String vehicleMake) {
			super();
			this.id = id;
			this.wheels = wheels;
			this.doors = doors;
			this.colour = colour;
			this.vehicleMake = vehicleMake;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getWheels() {
			return wheels;
		}

		public void setWheels(int wheels) {
			this.wheels = wheels;
		}

		public int getDoors() {
			return doors;
		}

		public void setDoors(int doors) {
			this.doors = doors;
		}

		public String getColour() {
			return colour;
		}

		public void setColour(String colour) {
			this.colour = colour;
		}

		public String getVehicleMake() {
			return vehicleMake;
		}

		public void setVehicleMake(String vehicleMake) {
			this.vehicleMake = vehicleMake;
		}

		@Override
		public String toString() {
			return "Vehicle [id=" + id + ", wheels=" + wheels + ", doors=" + doors + ", colour=" + colour
					+ ", vehicleMake=" + vehicleMake + "]";
		}
		
		public abstract double calculateBill();
		
}
