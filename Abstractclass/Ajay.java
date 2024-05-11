package Abstractclass;

public class Ajay extends Emp {
int hourlyrate;
int overtime;
public Ajay(int basesalary,String name,int overtime,int hourlyrate) {
	super(basesalary,name);
	this.hourlyrate=hourlyrate;
	this.overtime=overtime;
}
public int calculatesalary() {
	
	return basesalary +(hourlyrate * overtime);
}
public void displayinfo() {
	System.out.println("programmer name :"+name);
	System.out.println("Base salary :"+basesalary);
	System.out.println("overtime :"+overtime);
	System.out.println("overtime :"+hourlyrate);
	System.out.println("total salary "+calculatesalary());
}
}
