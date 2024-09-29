package practice;

import java.util.Scanner;

public class pallendrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int number=sc.nextInt();
		int originalnumber=number;
		int reverse=0;
		
while(number!=0) {
	int digit=number%10;
	reverse=reverse*10+digit;
	number/=10;
	
	if(originalnumber==reverse) {
		System.out.println(originalnumber +" is a pallendrome number");
	}else {
		System.out.println(originalnumber +" is not a pallendrome number");
	}
	sc.close();
}
	}

}
