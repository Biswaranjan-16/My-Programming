package Abstractclass;

public abstract class Emp {
int basesalary;
String name;
public Emp(int basesalary,String name) {
	this.name=name;
	this.basesalary=basesalary;
	
}
public abstract int calculatesalary();
public abstract void displayinfo();

}
