package Abstractclass;

public class Manager extends Employee {

private double bonus;
public Manager(String name,double basesalary,double bonus){
	super(name,basesalary);
	this.bonus=bonus;
}
public double calculatesalary() {
	return basesalary+bonus;
	
}
public void displayinfo() {
	System.out.println("manager name :"+name);
	System.out.println("base salary :"+basesalary);
	System.out.println("bonus :"+bonus);
	System.out.println("total salary :"+calculatesalary());
}
}
