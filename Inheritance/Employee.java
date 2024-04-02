package Inheritance;

public class Employee {
	int salary;
	public Employee(int s) {
		this.salary=s;
	}
	public Employee() {	
	}

	void work() {
		System.out.println("working as employee");
	}
	public  int getSalary() {
		return salary ;
	}
}
class Hrmanger extends Employee{
	
	public  int getSalary() {
		return salary ;
	}
	public Hrmanger(int s) {	
		this.salary=salary;
	}

	void work() {
		System.out.println("\n working as employee");
	}
	void addEmployee() {
		System.out.println("adding new employee");
	}
}
class test{
	public static void main(String args) {
		Employee emp=new Employee(3000);	
		Hrmanger hr=new Hrmanger(5000);
		emp.work();
		int s=emp.getSalary();
		System.out.println("Employee slary :"+s);
		hr.work();
		int h=hr.getSalary();
		System.out.println("Hrmanger slary :"+h);
		hr.addEmployee();
	}
	
}