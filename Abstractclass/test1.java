package Abstractclass;

public class test1 {

	public static void main(String[] args) {
		Circle circle=new Circle(4.0);
		circle.calculateperimeter();
		circle.calculatearea();																							
	System.out.println("area of circle :"+circle.calculatearea()+" perimeter of circle :"+circle.calculateperimeter());
	Rectangle rectangle=new Rectangle(3.0,5.0);
	rectangle.calculatearea();
	rectangle.calculateperimeter();
	System.out.println("area of rectangle :"+rectangle.calculatearea()+" perimeter of rectangle :"+rectangle.calculateperimeter());
	}
	

}
