package DSA;

import java.util.Scanner;

public class Fibonocciseries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int A=0,B=1,count=2;
		
		for(int i=1;i<=num;i++) {
			int temp=i;
			B=A+B;
			B=temp;
			count++;;
		}
		System.out.println(B);
		
	}

}
