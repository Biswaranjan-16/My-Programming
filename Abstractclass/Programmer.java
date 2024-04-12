package Abstractclass;

public class Programmer extends Employee{
	private int overtimeHours;
	  private double hourlyRate;
public Programmer( String name,int overtimeHours,double hourlyRate, double basesalary) {
	super(name,basesalary);
	this.overtimeHours=overtimeHours;
	this.hourlyRate=hourlyRate;
}
public double calculatesalary() {
		return basesalary +(overtimeHours*hourlyRate);
}
public void displayinfo() {
	System.out.println("manager name :"+name);
	System.out.println("base salary :"+basesalary);
	System.out.println("overtimeHours :"+overtimeHours);
	System.out.println("total salary :"+calculatesalary());
	
}
}
