package Polymorphism;

public class Sport {
public void play() {
	System.out.println("playing sports ........");
}
}
class Football extends Sport{
	public void play() {
		System.out.println("playing football");
	}
}
class Basketball extends Sport{
public 	void play() {
		System.out.println("playing Basketball ");
	}
}
class Rugby extends Sport{
	public void play() {
		System.out.println("playing rugby...");
	}
}