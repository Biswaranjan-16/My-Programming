package oops.inheritance;

public class Shape {
 double getArea() {
	return 0.0;
}
	}
	class Rectangle extends Shape{
		int length;
		int width;
		
		public  Rectangle(int l,int w) {
			this.width=w;
			this.length=l;
		}
		double getArea() {
			return length * width;
		}
	}
class Main{
	public static void main(String args[]) {
		Rectangle rec=new Rectangle(2,3);
		double Area = rec.getArea();
		System.out.println("area of rectangle is :" + Area);
	}
}
