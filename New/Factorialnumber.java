package New;

import java.util.Scanner;

public class Factorialnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		long factorial=1;
		for(int i=1;i<=num;i++) {
			factorial*=i;
		}
System.out.println("Factroial of "+num+"is "+factorial);
	}

}
