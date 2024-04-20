package String;
import java.util.Scanner;
public class Compare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String str1 = sc.nextLine();
		System.out.println("enter second string");
		String str2 = sc.nextLine();
		
//		String str1="Biswaranjan biswal";
//		String str2="Ajay sethy";
//		System.out.println(str1);
//		System.out.println(str2);
		int cmp=str1.compareTo(str2);
		int result;
		if(cmp<0) { 
			System.out.println(str1+" is graeater than "+str2);
		}else if(cmp==0) {
			System.out.println(str1+"is equal to "+str2);
		}else {
			System.out.println(str1+" is less than "+str2);
		}

	}

}
