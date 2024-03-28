package oops;

public class Person {
	
	   public  String name;
	   public int age;
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    public String getName() {

	        return name;
	    }

	    public int getAge() {
	 
	        return age;
	    }

	    public static void main(String[] args) {
	        Person person = new Person("biswa",25);

	        System.out.println("Name: " + person.getName());
	        System.out.println("Age: " + person.getAge());

	        
	    }
	}

