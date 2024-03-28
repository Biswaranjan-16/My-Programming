package oops;

public class Rectangle {
	
	   double width;
	   double height;
	   double volume;
	   public Rectangle(double width,double height) {
	     this.width=width;
	     this.height=height;
	   }
	   public double area(){
	     
	  return width*height;
	     
	   }
	   public static void main(String[] args) {
	     Rectangle rec=new Rectangle(13,14);
	     System.out.println("area :"+rec.area());
	}
	   }

