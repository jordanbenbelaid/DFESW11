package solution;

public class BedroomAdder {
	
	public void addSqft(Apartment apartment) {
		apartment.setSquareFootage(apartment.getSquareFootage() + 50);
	}
	
	public void addBedroom(Penthouse penthouse, int bedrooms) {
		addSqft(penthouse);
		penthouse.setNumberOfBedrooms(penthouse.getNumberOfBedrooms() + bedrooms);
	}
}
