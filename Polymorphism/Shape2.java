package Polymorphism;

public class Shape2  {
public double getArea() {
	return 0;
}
public double getPerimeter() {
	return 0;
}
}
class Circle extends Shape2{
	double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	public double getArea() {
		return Math.PI *radius*radius;
	}
	public double getperimeter() {
		return 2*Math.PI*radius;
	}
}
class Rectangle extends Shape2{
	double length;
	double width;
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	public double getArea() {
		return length*width;
	}
	public double getperimeter() {
		return 2 *(length+width);
	}
}
class Triangle extends Shape2{
	    double side1;
	    double side2;
	    double side3;

	    public Triangle(double side1, double side2, double side3) {
	        this.side1 = side1;
	        this.side2 = side2;
	        this.side3 = side3;
	    }
	    public double getArea() {
	        double s = (side1 + side2 + side3) / 2;
	        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	    }
	    public double getPerimeter() {
	        return side1 + side2 + side3;
	    }
	}
class m5{
	public static void main(String args[]) {
		Circle c=new Circle(3);
		Rectangle r=new Rectangle(2,4);
		Triangle t=new Triangle(7,8,9);
		c.getArea();
		c.getperimeter();
		System.out.println("Circle area ;"+c.getArea()+"circle perimeter :"+c.getperimeter());
		r.getArea();
	r.getperimeter();
	System.out.println("Rectangle area :"+r.getArea()+"Rectangle perimeter :"+r.getperimeter());
		t.getArea();
		t.getPerimeter();
		System.out.println("Tringle area :"+t.getArea()+"Tringle perimeter :"+t.getPerimeter());
	}
}