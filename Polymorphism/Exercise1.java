package Polymorphism;

public class Exercise1 {

	void sound() {
		System.out.println("main class sound");
	}
	void sound(String a) {
		System.out.println("method overloading");
	}
	
	
	public static void main(String[] args) {
		Exercise1 e1=new Exercise1();
		e1.sound();
		e1.sound("hello");
		

	}

}
