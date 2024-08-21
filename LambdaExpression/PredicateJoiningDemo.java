package LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee{
	String name;
	String location;
	String dept;
	Employee(String name,String location,String dept){
		this.dept=dept;
		this.location=location;
		this.name=name;
	}
}
public class PredicateJoiningDemo {
public static void main(String[] args) {
	Employee e1=new Employee("Biswa", "pune", "java");
	Employee e2=new Employee("Tiku", "Hyd", "db");
	Employee e3=new Employee("Babu", "pune", "java");
	Employee e4=new Employee("Subhu", "bbsr", "python");
	Employee e5=new Employee("Miku", "mbj", "oracle");
	
	List<Employee> emps=Arrays.asList(e1,e2,e3,e4,e5);
	
	Predicate<Employee>p1= e -> e.location.equals("pune");
	Predicate<Employee>p2=e -> e.dept.equals("java");
	
	Predicate<Employee> p=p1.and(p2);
	
	for(Employee e:emps) {
		if(p.test(e)) {
			System.out.println(e.name);
		}
	}
}
}
