import java.util.Scanner;
class Si{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter principle");
int p=sc.nextInt();
System.out.println("Enter time period");
int t=sc.nextInt();
System.out.println("Enter rate of interest");
int r=sc.nextInt();
int si=(p*t*r)/100;
System.out.println("simple interest is"+si);
}
}