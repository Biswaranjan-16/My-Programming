package Basic;
import java.util.Scanner;
public class Primenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		int temp=0;
		boolean sum;
		System.out.println("Enter the number");
		num=sc.nextInt();

for(int i=1;i<=num;i++) {
	if(num%i==0) {
	temp++;
}}
if(temp==2) {
	System.out.println("It is a Prime number");
}else {
	System.out.println("It is not a Prime number");
}
	}

}
