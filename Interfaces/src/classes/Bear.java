package classes;

import interfaces.Carnivore;
import interfaces.Herbivore;

public class Bear implements Carnivore, Herbivore{

	@Override
	public void eatGrass() {
		System.out.println("I eat grass and plants");
		
	}

	@Override
	public void eatMeat() {
		System.out.println("I eat meat and fish");
		
	}

	
}
