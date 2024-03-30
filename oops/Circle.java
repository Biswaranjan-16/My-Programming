package oops;

public class Circle {
	

	
	double radius;
	public  Circle(double radius) {
	  this.radius=radius;
	}
	   public double area() {
	     return 3.14*radius;
	   }
	   public double circumstances() {
	     return 2*3.14*radius;
	   }
	  public static void main(String[] args) {
	    Circle c=new Circle(13);
	    System.out.println("area :"+c.area());
//	    Circle c1=new Circle(18);
	    System.out.println("circumstances :"+c.circumstances());
	  }

	}

