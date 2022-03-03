package runner;

import garage.Garage;
import vehicles.Car;
import vehicles.Motorbike;

public class Runner {
	
	public static void main(String[] args) {
		Car carOne = new Car(1, 4, 5, "Blue", "BMW", 2, true);
		Car carTwo = new Car(2, 4, 3, "Red", "Audi", 4, false);
		
		Motorbike bikeOne = new Motorbike(3, 2, 0, "Black", "BMW", 200);
		Motorbike bikeTwo = new Motorbike(4, 2, 0, "White", "Harley Davidson", 130);
		
		Garage garage = new Garage();
		
		garage.addVehicle(bikeTwo);
		garage.addVehicle(bikeOne);
		garage.addVehicle(carOne);
		garage.addVehicle(carTwo);
		
		//garage.calculateBillById(2);
		//garage.calculateTotalBill();
		//garage.removeVehicleByType("Audi");
		garage.vehicleTypeBill(carTwo);
		
		
		garage.printAll();
		
	}

}
