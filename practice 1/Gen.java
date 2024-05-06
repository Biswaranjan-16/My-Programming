import java.util.Scanner;
	class Gen{
		public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
		char gen;
		System.out.println("enter gender :");
		gen=sc.next().charAt(0);
     switch(gen){
		case 'M':
		case 'm':
			System.out.println("male");
			break;
		case 'F':
		case 'f':
			System.out.println("Female");
			break;
		default:
			System.out.println("no");
		}
	}
}