package New;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		int temp=0;
		boolean sum;
		System.out.println("enter a number");
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				temp++;
			}
		}
if(temp==2) {
	System.out.println("number is a prime number");
}else {
	System.out.println("number is not a prime number");
}
	}

}
