package Encapsulation;

public class main {
public static void main(String[] args) {
 Person person = new Person("biswa",25,"USA");
 
 person.setName("biswa");
 person.setAge(25);
 person.setCountry("USA");

 String name = person.getName();
 int age = person.getAge();
 String country = person.getCountry();

 System.out.println("Name: " + name);
 System.out.println("Age: " + age);
 System.out.println("Country: " + country);
		}
	}
