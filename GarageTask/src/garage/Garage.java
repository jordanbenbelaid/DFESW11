package garage;

import java.util.ArrayList;
import java.util.List;

import vehicles.Vehicle;

public class Garage {

	private List<Vehicle> vehicles = new ArrayList<>();
	
	public void calculateBillById(int id) {
		for(Vehicle v : vehicles) {
			if(v.getId() == id) {
				System.out.println("The bill costs: " + v.calculateBill());
			}
		}
	}
	
	public void calculateTotalBill() {
		double totalCost = 0;
		for(Vehicle v : vehicles) {
			totalCost += v.calculateBill();
		}
		System.out.println("The total bill of the garage is: " + totalCost);
	}
	
	//WORKS!!!!!!!!
	public void vehicleTypeBill(Vehicle vehicle) {
		double total = 0;
		for(Vehicle v : vehicles) {
			if(v.getClass().equals(vehicle.getClass())) {
				total += v.calculateBill();
			}
		}
		System.out.println("The total of all " + vehicle + " is " + total);
	}
	
	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
		System.out.println("Vehicle added");
	}
	
	public void removeVehicle(Vehicle vehicle) {
		this.vehicles.remove(vehicle);
		System.out.println("Vehicle removed");
	}
	
	public void removeVehicleById(int id) {
		//Stream version for removing a vehicle by id
//		vehicles.stream().forEach(v -> {if(v.getId() == id) removeVehicle(v); System.out.println("Vehicle with id of " + id + " has been deleted");});
		
		//Loop version off removing a vehicle by ID
		for(Vehicle v : vehicles) {
			if(v.getId() == id) {
				removeVehicle(v);
			}
		}
		System.out.println("Vehicle with id of " + id + " has been deleted");
	}
	
	public void removeVehicleByType(String make) {
		List<Vehicle> foundType = new ArrayList<>();
		for(Vehicle v : vehicles) {
			if(v.getVehicleMake().equalsIgnoreCase(make)) {
				foundType.add(v);
			}
		}
		for(Vehicle v : foundType) {
			vehicles.remove(v);
		}
	}
	
	public void emptyGarage() {
		this.vehicles.clear();
		System.out.println("All vehicles deleted!");
	}
	
	public void printAll() {
		System.out.println("Full vehicle list: \n");
		for(Vehicle v : vehicles) {
			System.out.println(v + "\n");
		}
	}
	
	
	
	
	
	
}
