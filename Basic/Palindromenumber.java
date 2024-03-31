package Basic;
import java. util.Scanner;
public class Palindromenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0,rem,sum=0,temp=num;
System.out.println("Enter the number");
num=sc.nextInt();
for(int i=0;i<num;i++) {
	rem=num%10;
	sum=(rem*10)+rem;
	num=num/10;
}
if(temp==sum) {
	System.out.println("it is a Palindromenumber number ");
}else {
	System.out.println("it is a not Palindromenumber number ");
}
	}

}
