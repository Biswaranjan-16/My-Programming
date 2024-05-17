package test;

public abstract class Shape {
abstract  double calculatearea();
abstract double calculateperimeter();
}


class  Circle extends Shape{
int radius;
Circle(int radius){
	this.radius=radius;
}
	double calculatearea() {
return Math.PI*radius*radius;

		
	}

	double calculateperimeter() {
return 2*Math.PI*radius;

	}
	
class Rectangular extends Shape{
int height;
int width;
Rectangular(int height,int width){
	this.height=height;
	this.width=width;
}	
		double calculatearea() {
			
			return height*width;
		}
		double calculateperimeter() {
			
			return 2*(height + width);
		}
	}
}
