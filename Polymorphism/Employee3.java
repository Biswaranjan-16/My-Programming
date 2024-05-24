package Polymorphism;

class Employee3 {
String name;
String role;
public  Employee3(String name,String role) {
	this.name=name;
	this.role=role;
}
	 public String getName() {
		return name;
	}
	 public String getRole() {
			return role;
	 }
	 public double calculateSalary() {
		 return 0;
	 }
}
class Manager extends Employee3{
	double basesalary;
	double bonus;
	public Manager(String name,String role,double basesalary,double bonus) {
		super(name,"manager");
		this.basesalary=basesalary;
		this.bonus=bonus;
	}
	public double getbasesalary() {
		return basesalary;
	}
	public double getbonus() {
		return bonus;
	}
	public double calculatesalary() {
		return basesalary + bonus;
	}
}
class Programmer extends Employee3{
	double basesalary;
	double overduty;
	public Programmer( String name,double basesalary,double overduty) {
		super(name,"Programmer");
		this.basesalary=basesalary;
		this.overduty=overduty;
	}
	public double getbasesalary() {
		return basesalary;
	}
	public double getoverduty() {
		return overduty;
	}
	public double calculatesalary() {
		return basesalary + overduty;
	}
}
