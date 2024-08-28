package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Employee2{
	int age;
	double salary;
	String name;
	
	public Employee2(String name,int age,double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
}
public class EmployeeDemo {
	public static void main(String[] args) {

Employee2 e1=new Employee2("Biswa", 23, 55000.00);
Employee2 e2=new Employee2("tiku", 33, 35000.00);
Employee2 e3=new Employee2("miku", 27, 65000.00);
Employee2 e4=new Employee2("subhu", 29, 45000.00);

Stream<Employee2> st=Stream.of(e1,e2,e3,e4);

	}
}
