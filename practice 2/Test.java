 class Vehicle {
	void drive() {
		System.out.println("Repairing a vehicle");
	}
}
 class Car {
	void drive() {
		System.out.println("Repairing a car");
	}
}
 class Test{
	 public static void main(String[] args) {
		Vehicle vehicle=new Vehicle();
		Car car=new Car();
		vehicle.drive();
		car.drive();
	}
}