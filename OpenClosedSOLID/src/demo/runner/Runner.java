package demo.runner;

import demo.shapes.AreaCalculator;
import demo.shapes.Circle;
import demo.shapes.Rectangle;

public class Runner {

	public static void main(String[] args) {
		AreaCalculator shape = new AreaCalculator();
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		
		
		shape.calculateShapeArea(rectangle);
	}
}
