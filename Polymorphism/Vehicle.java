package Polymorphism;

public class Vehicle {
int speed;
	void speedup() {
		speed=+10;
	}
	public int getSpeedup() {
		return speed;
	}
}
class Car extends Vehicle{
	void speedup() {
		super.speedup();
		System.out.println("car increased by 22 units");
	}
}
class Motorcycle extends Vehicle{
	void speedup() {
		super.speedup();
		System.out.println("motorcycle increased by 12 units");
	}
}
class t1{
	public static void main(String args[]) {
		Car c=new Car();
		Motorcycle m=new Motorcycle();
		Motorcycle motorcycle = new Motorcycle();
        System.out.println("Car initial speed: " + c.getSpeedup());
        System.out.println("Motorcycle initial speed: " + m.getSpeedup());
		c.speedup();
		m.speedup();
		System.out.println("\nCar speed after speeding up: " + c.getSpeedup());
        System.out.println("Motorcycle speed after speeding up: " + m.getSpeedup());
	}
}