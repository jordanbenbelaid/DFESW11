package classes;

import interfaces.Carnivore;
import interfaces.SeaAnimal;

public class Shark implements SeaAnimal, Carnivore{

	@Override
	public void eatMeat() {
		System.out.println("I eat all kinds of fish");	
	}

	@Override
	public void swim() {
		System.out.println("I am gonna get you");
	}

}
