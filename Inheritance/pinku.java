package Inheritance;
import java.io.*;
class Babu{
	int salary = 60000;
}
class Engineer extends Babu {
	int benefits = 10000;
}
class pinku {
	public static void main(String args[])
	{
		Engineer E1 = new Engineer();
		System.out.println("Salary : " + E1.salary
						+ "\nBenefits : " + E1.benefits);
	}
}
