package Abstractclass;

public   class Biswa extends Emp {
int bonus;
public Biswa(int basesalary,String name,int bonus) {
	super(basesalary,name);
	this.bonus=bonus;
}
public int calculatesalary() {
	return basesalary+ bonus ;
}
public  void displayinfo() {
	System.out.println("manager name :"+name);
	System.out.println("Base salary :"+basesalary);
	System.out.println("Bonus :"+bonus);
	System.out.println("total salary "+calculatesalary());
}
}
