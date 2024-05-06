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
	public Manager(String name,double basesalary,double bonus) {
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
class m3{
	public static void main(String args[]) {
		Manager m=new Manager("Biswa",7500,3000);
		Programmer p=new Programmer("ajay",8700,6500);
		m.calculatesalary();
		p.calculatesalary();
		System.out.println("Name :"+m.getName()+"/nbase salary :"+m.getbasesalary()+"/n bonus :"+m.getbonus()+"/n total salary :"+m.calculatesalary()+".");
		System.out.println("name :"+p.getName()+"/n base salary :"+m.getbasesalary()+"/n over duty :"+p.getoverduty()+"/n total salary :"+p.calculatesalary()+".");
	}
}