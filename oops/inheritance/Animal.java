package oops.inheritance;

public class Animal {
		void makeSound() {
			System.out.println("Animal are barking");
		}
			}
class Cat extends Animal {
	void makeSound() {
		System.out.println("Cats are barking");
	}
		}
	class main{
		public static void main(String args[]) {
			Cat c=new Cat();
			c.makeSound();
		}
	}

 