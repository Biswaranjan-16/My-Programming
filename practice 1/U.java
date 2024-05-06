import java.util.Scanner;
	  class U{
		public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the character");
	char ch;
	ch=sc.next().charAt(0);
     if(ch>='A' && ch<='Z'){
		System.out.println("upper case");
	}
	else{
		System.out.println("lower case");
	}
    }
}