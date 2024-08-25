package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Employee{
	int age;
	double salary;
	String name;
	
	public Employee(String name,int age,double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
}
public class EmployeeDemo {
	public static void main(String[] args) {

Employee e1=new Employee("Biswa", 23, 55000.00);
Employee e2=new Employee("tiku", 33, 35000.00);
Employee e3=new Employee("miku", 27, 65000.00);
Employee e4=new Employee("subhu", 29, 45000.00);

Stream<Employee> st=Stream.of(e1,e2,e3,e4);

	}
}
