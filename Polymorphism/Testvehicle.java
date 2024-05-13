package Polymorphism;

public class Testvehicle {
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
