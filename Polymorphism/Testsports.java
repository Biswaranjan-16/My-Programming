package Polymorphism;

public class Testsports {
	public static void main(String args[]) {
		Football f=new Football();
		Basketball b=new Basketball();
		Rugby r=new Rugby();
		Sport s=new Sport();
		s.play();
		f.play();
		b.play();
		r.play();
}
}