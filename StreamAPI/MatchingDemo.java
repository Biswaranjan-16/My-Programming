package StreamAPI;

import java.util.Arrays;
import java.util.List;

import String.string2;

class Person{
	String name;
	String country;
	public Person(String name,String country) {
		this.country=country;
		this.name=name;
	}
}
public class MatchingDemo {

	public static void main(String[] args) {
		Person  p1=new Person("Biswa", "India");
		Person  p2=new Person("tiku", "usa");
		Person  p3=new Person("miku", "russia");
		Person  p4=new Person("subhu", "austrelia");
		Person  p5=new Person("baba", "dubai");
		Person  p6=new Person("mommy", "Canada");
		
		List<Person> person=Arrays.asList(p1,p2,p3,p4,p5,p6);
		
	boolean status1=person.stream().anyMatch(i -> i.country.equals("India"));
	System.out.println(status1);
	
	boolean status2=person.stream().allMatch(i -> i.country.equals("pakistan"));
	System.out.println(status2);
	
	boolean status3=person.stream().noneMatch(i -> i.country.equals("pakistan"));
	System.out.println(status3);
		
	}

}
