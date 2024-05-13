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
