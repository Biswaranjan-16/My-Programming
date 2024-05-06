 class Shape1 {
double calculateArea() {
	return 0;
}
}
class Circle extends Shape1{
	double radius;
	public Circle(double r) {
		this.radius=r;
	}
	public double calculateArea() {
		return Math.PI *radius*radius;
	}
}
class Rectangle extends Shape1 {
	double height;
	double width;
	public Rectangle(double h,double w) {
		this.width=w;
		this.height=h;
	}
	public double calculateArea() {
		return height *width;
	}
}
class Triangle extends Shape1{
	double height;
	double base;
	public Triangle(double h,double b) {
		this.height=h;
		this.base=b;
	}
	public double calculateArea() {
		return 0.5 *height*base;
	}
}

class m2{
	public static void main(String[] args) {
		Circle c=new Circle(5);
		Rectangle r=new Rectangle(4,8);
		Triangle t=new Triangle(3,6);
		c.calculateArea();
		r.calculateArea();
		t.calculateArea();
	}
}