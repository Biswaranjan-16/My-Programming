package oops;

public class Dog {
	  String name;
	  String bread;
	  public Dog() {
	    this.name=name;
	    this.bread=bread;
	  }
	  public void setDog(String n,String b) {
	    name=n;
	    bread=b;
	  }
	  public void getDog() {
	    System.out.println("dog name :"+name);
	    System.out.println("dog bread :"+bread);
	  }
	public static void main(String[] args) {
	  Dog d=new Dog();
	  d.setDog("Rani","Labra");
	  d.getDog();
	}
	     }

