package Basic;

import java.util.Scanner;

public class Pallendrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, rem, sum = 0, temp = sum;
		System.out.println("enter the number");
		num = sc.nextInt();

		for (int i = 0; i <= 1; i++) {
			rem = num % 10;
			sum = (rem * 10) + rem;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("it is a pallendome number");
		} else {
			System.out.println("it is not a pallendrome number");
		}
	}

}
