package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person1{
	String name;
	String country;
	
	
	public Person1(String name,String country) {
		this.country=country;
		this.name=name;
		
	}
	@Override
	public String toString() {
		return "Person1 [name=" + name + ", country=" + country + "]";
	}
}   

public class CollectorDemo {

	public static void main(String[] args) {
		Person1  p1=new Person1("Biswa", "India");
		Person1  p2=new Person1("tiku", "usa");
		Person1  p3=new Person1("miku", "russia");
		Person1  p4=new Person1("subhu", "austrelia");
		Person1  p5=new Person1("baba", "dubai");
		Person1  p6=new Person1("mommy", "India");
		
		List<Person1> person=Arrays.asList(p1,p2,p3,p4,p5,p6);
		
		//List<Person1> indian=person.stream().filter(i -> i.country.equals("India")).collect(Collectors.toList());
		//indian.forEach(i -> System.out.println(i));
		
	List<String> name=	person.stream().filter(i -> i.country.equals("India")).map(i -> i.name).collect(Collectors.toList());
		System.out.println(name);
		

	}

}
