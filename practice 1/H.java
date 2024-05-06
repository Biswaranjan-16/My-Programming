import java.util.Scanner;
	class H{
		public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	   char ch;
		System.out.println("enter chracter");
	   ch=sc.next().charAt(0);
	 if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
	switch(ch){
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("this is vowel");
			break;
		default:
			System.out.println("this is consonant");
			break;
		}
	}
		else{
			System.out.println("this is number");
		}
	}

}
