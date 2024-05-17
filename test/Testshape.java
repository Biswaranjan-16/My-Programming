package test;

public class Testshape {

	public static void main(String[] args) {
		
			Shape t=new Circle(10);
		    System.out.println(t.calculatearea());	
			System.out.println(t.calculateperimeter());
			Shape r=new Rectangular(14,10);
			System.out.println(r.calculatearea());
			System.out.println(r.calculateperimeter());
			}

	}


