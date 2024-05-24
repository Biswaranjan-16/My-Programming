package Polymorphism;

public class Testemployee {
	
		public static void main(String args[]) {
			Manager m=new Manager("Biswa","manager",7500,3000);
			Programmer p=new Programmer("Ajay",8700,6500);
			m.calculatesalary();
			p.calculatesalary();
			System.out.println("Name :"+m.getName()+"\nBase salary :"+m.getbasesalary()+"\nBonus :"+m.getbonus()+"\nTotal salary :"+m.calculatesalary()+".");
			System.out.println("------------");
			System.out.println("Name :"+p.getName()+"\nBase salary :"+m.getbasesalary()+"\nOver duty :"+p.getoverduty()+"\nTotal salary :"+p.calculatesalary()+".");
		}
}
