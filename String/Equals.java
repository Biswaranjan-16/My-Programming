package String;
import java.util.Scanner;
public class Equals {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String str1=sc.nextLine();
		System.out.println("enter second string");
		String str2=sc.nextLine();
		System.out.println("enter third string");
		String str3=sc.nextLine();
//		String str1="Biswaranjan biswal";
//		String str2="Ajay sethy";
//		String str3="telgu raja";
//		boolean t1=str1.equals(str2);
//		boolean t2=str2.equals(str3);
//		boolean t3=str3.equals(str1);
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str1));

	}

}
