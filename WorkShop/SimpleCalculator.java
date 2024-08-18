package WorkShop;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first number");
		double num1=sc.nextDouble();
		
		System.out.println("enter second number");
		double num2=sc.nextDouble();
		
		System.out.println("enter operator");
		char operator=sc.next().charAt(0);
		
		double result;
		switch(operator) {
		
		case '+' :
			result=num1+num2;
			break;
			
		case '-' :
			result=num1-num2;
			break;
			
		case '*' :
			result=num1*num2;
			break;
			
		case '/':
			
			if(num2 !=0) {
		    result=num1/num2;			
			}else {
				System.out.println("error:zero in not Allowed");
				return;
			}
			break;
			default:
				System.out.println("invalid operator");
				return;
		}
		System.out.println("the result is :" +result);
		
		}

	}
