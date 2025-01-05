package Basic;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System .in);
		System.out.println("Enterc the number");
		int number=sc.nextInt();
		
		int Factorial=1;
		for(int i=1;i<=number;i++) {
			Factorial*=i;
		}
		System.out.println("Factorial of the "+number+" is "+Factorial);

	}

}
