package Polymorphism;

public class Vehicle {
int speed;
	void speedup() {
		speed=+10;
	}
	 int getSpeedup() {
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