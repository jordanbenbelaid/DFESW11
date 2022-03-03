package domain;

import interfaces.LifeExpectancy;
import interfaces.Speed;

public abstract class Animal implements Speed, LifeExpectancy{

	private String food;
	private String habitat;
	private int age;
	
	public Animal(String food, String habitat, int age) {
		this.food = food;
		this.habitat = habitat;
		this.age = age;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract void sleep();
	public abstract void breeding();

	@Override
	public String toString() {
		return "Animal [food=" + food + ", habitat=" + habitat + ", age=" + age + "]";
	}
	
	
}
