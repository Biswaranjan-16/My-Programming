package Encapsulation;

public class Circle {
private double radius;

public double getRadius() {
	return radius;
}

public void setRadius(double radius) {
	this.radius = radius;
}
public double Calculatearea() {
	return 2*Math.PI*radius;
}
public double calculateperimeter() {
	return Math.PI*(radius*radius);
}
}
