package Polymorphism;

public class Testshape {
	public static void main(String[] args) {
		Circle c=new Circle(5);
		Rectangle r=new Rectangle(4,8);
		Triangle t=new Triangle(3,6);
		
		System.out.println(r.calculateArea());
		System.out.println(t.calculateArea());
		System.out.println(c.calculateArea());
	}
}
