package Polymorphism;

public class Animal1 {
	void makesound() {
		System.out.println("The Animal are Barking");
	}
}
class Bird extends Animal1{
	void makesound() {
		System.out.println("The Birds are Squrling");
	}
}
class Cat extends Animal1{
	void makesound() {
		System.out.println("The Catss are Barking");
	}
}
class t{
	public static void main(String args[]) {
		Animal1 a1=new Animal1();
		a1.makesound();
		Bird b=new Bird();
		b.makesound();
		Cat c=new Cat();
		c.makesound();
		
	}
}