package Basic;

import java.util.Scanner;

public class Prime1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		int temp=0;
		boolean sum;
		System.out.println("enter the number");
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				temp++;
			}
		}
		if(temp==2) {
			System.out.println("it is a prime number");
		}else {
			System.out.println("it is not a prime number");
		}

	}

}
