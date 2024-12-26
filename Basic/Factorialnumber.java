package Basic;

import java.util.Scanner;

public class Factorialnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		
		long  Factorial=1;
		for(int i=1;i<=number;i++) {
			Factorial*=i;
		}
			System.out.println("The Factorial of "+ number + " is " + Factorial);
		

	}

}
