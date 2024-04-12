package Abstractclass;

public class Rectangle extends Shape{
double length;
double breadth;
public Rectangle(double length,double breadth) {
	this.length=length;
	this.breadth=breadth;
}

public double calculatearea() {
		return length*breadth;
}

public double calculateperimeter() {
		return 2*(length+breadth);
}
}
