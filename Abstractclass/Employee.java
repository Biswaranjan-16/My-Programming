package Abstractclass;

abstract class Employee {
protected String name;
public double basesalary;
public Employee(String name,double basesalary) {
	this.name=name;
	this.basesalary=basesalary;
}
		public abstract double calculatesalary();
		public abstract void displayinfo();
}
