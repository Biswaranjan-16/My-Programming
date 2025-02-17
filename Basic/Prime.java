package Basic;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, temp = 0;
		boolean sum;

		System.out.println("enter the number");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				temp++;
			}
		}
		if (temp == 2) {
			System.out.println("itis a prime number");
		} else {
			System.out.println("it is not amprime number");
		}
	}

}
