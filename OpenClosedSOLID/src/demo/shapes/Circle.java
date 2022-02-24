package demo.shapes;

import demo.interfaces.Shape;

public class Circle implements Shape{

	private double radius;

	//interface method implemented
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
