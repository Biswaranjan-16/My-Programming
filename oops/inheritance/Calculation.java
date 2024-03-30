package oops.inheritance;

public class Calculation {
	double getArea() {
		return 0.0;
	}
	 double getPerimeterr() {
		 return 0.0;
	 }
	}
	class Circle extends Calculation{
		double radius;
		public Circle(double r) {
			this.radius=r;
		}
		double getArea() {
			return 2 * Math.PI*radius ;
		}
		double getPerimeterr() {
			 return Math.PI*radius*radius;
		 }
	}
class p{
	public static void main(String aargs[]) {
		Circle c=new Circle(12);
		double area=c.getArea();
		System.out.println("area of the circle :"+area);
		double perimeter=c.getPerimeterr();
		System.out.println("perimeter of the circle :"+perimeter);
	}
		}

