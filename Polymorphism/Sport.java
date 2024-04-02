package Polymorphism;

public class Sport {
void play() {
	System.out.println("playing sports ........");
}
}
class Football extends Sport{
	void play() {
		System.out.println("playing football");
	}
}
class Basketball extends Sport{
	void play() {
		System.out.println("playing Basketball ");
	}
}
class Rugby extends Sport{
	void play() {
		System.out.println("playing rugby...");
	}
}
class m4{
	public static void main(String args[]) {
		Football f=new Football();
		Basketball b=new Basketball();
		Rugby r=new Rugby();
		Sport s=new Sport();
		s.play();
		f.play();
		b.play();
		r.play();
}}