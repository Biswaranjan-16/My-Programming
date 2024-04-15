package Encapsulation;

public class test2 {
public static void main(String args[]) {
	Circle c=new Circle();
	c.setRadius(4);
	c.getRadius();
	c.Calculatearea();
	c.calculateperimeter();
	System.out.println("Area of circle:"+c.Calculatearea());
	System.out.println("Perimeterv of the circle:"+c.calculateperimeter());
}
}
