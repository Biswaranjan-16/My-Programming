package LambdaExpression;

import java.util.Optional;
import java.util.Scanner;

public class OptionalMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter user Id");
		int userid=sc.nextInt();
		
		OptionalDemo od=new  OptionalDemo();
		
		Optional<String> o=od.getusername(userid);
		if(o.isPresent()) {
			String name=o.get();
			System.out.println("Hello "+name);
		}else {
			System.out.println("User Id not found");
		}

	}

}
