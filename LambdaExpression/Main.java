package LambdaExpression;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter youur id");
		int userid = sc.nextInt();

		User u = new User();
		String username = u.getnamebyid(userid);

		if (username != null) {
			String msg = username.toUpperCase();
			System.out.println(msg);
		} else {
			System.out.println("Invalid Id");
		}

	}

}
