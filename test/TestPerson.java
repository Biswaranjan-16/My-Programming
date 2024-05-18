package test;

public class TestPerson {

	public static void main(String[] args) {
		Person p=new Person();
		p.setAge(12);
		p.setName("Biswa");
		p.setSalary(4300);
		
	int age=p.getAge();
	String name=p.getName();
	int salary=p.getSalary();
	
	
	System.out.println("Name is :"+name);
	System.out.println("Age of Biswa :"+age);
	System.out.println("Salary of Biswa :"+salary);
	}

}
