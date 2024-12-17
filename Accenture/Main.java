package Accenture;

import oops.Dog;

class Animal{
	public String name;
	
	

	public Animal(String name) {
		super();
		this.name = name;
	}



	public void speak() {
		System.out.println(name +"speak");
	} 
}
 class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	
	public void speak() {
		System.out.println(name +"speak");
	} 	 
 }

 class camel extends Animal{
	 public camel(String name) {
	super(name);
	}
	 public void speak() {
			System.out.println(name +"speak");
		}  
 }
public class Main {

	public static void main(String[] args) {
		Dog dog=new Dog("JULI");
		camel camel=new camel("Biswa");
		dog.speak();
		camel.speak();

	}

}
