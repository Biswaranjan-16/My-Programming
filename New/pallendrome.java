package New;

import java.util.Scanner;

public class pallendrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=0,sum=0,rem,temp=num;
		num=sc.nextInt();
		for(int i=0;i<num;i++) {
			rem=num%10;
			sum=(rem*10)+rem;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("it is a pallendrome number");
		}else {
			System.out.println("it is not a pallendrone number");
		}

	}

}
