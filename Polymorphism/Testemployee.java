package Polymorphism;

public class Testemployee {
	
		public static void main(String args[]) {
			Manager m=new Manager("Biswa",7500,3000);
			Programmer p=new Programmer("ajay",8700,6500);
			m.calculatesalary();
			p.calculatesalary();
			System.out.println("Name :"+m.getName()+"/n base salary :"+m.getbasesalary()+"/n bonus :"+m.getbonus()+"/n total salary :"+m.calculatesalary()+".");
			System.out.println("name :"+p.getName()+"/n base salary :"+m.getbasesalary()+"/n over duty :"+p.getoverduty()+"/n total salary :"+p.calculatesalary()+".");
		}
}
