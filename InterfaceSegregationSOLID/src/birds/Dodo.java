package birds;

import interfaces.EggLayingCreature;
import interfaces.ExtinctCreature;

public class Dodo implements EggLayingCreature, ExtinctCreature{

	private String currentLocation;
    private int numberOfEggs;

    public Dodo(int initialEggCount) {
        this.setNumberOfEggs(initialEggCount);
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getNumberOfEggs() {
        return numberOfEggs;
    }

    public void setNumberOfEggs(int numberOfEggs) {
        this.numberOfEggs = numberOfEggs;
    }

	@Override
	public void isExtinct() {
		System.out.println("I am extinct");
	}

	@Override
	public void layEggs() {
		System.out.println("I lay eggs");	
	}
	
}
