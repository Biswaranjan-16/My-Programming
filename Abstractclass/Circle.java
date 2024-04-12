package Abstractclass;

public class Circle extends Shape {
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
	}

	
	public double calculatearea() {
		return Math.PI *radius*radius;
		
	}

	
	public double calculateperimeter() {
	return 2*Math.PI*radius;
		
	}
	
}
