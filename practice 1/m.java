import java.util.Scanner;
	class m{
	   public static void main(String args[]){
	   Scanner sc=new Scanner(System.in);
  	   Character ch;
		System.out.println("enter character");
	   ch=sc.next().charAt(0);
 	if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
		System.out.println("it is a alphabet");
	}
	else if(ch>='0' && ch<='9'){
		System.out.println("it is a number");
	}
	else{
		System.out.println("it is a special character");
}
}
}