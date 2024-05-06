import java.util.Scanner;
class W{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num;
System.out.println("enter the number");
num=sc.nextInt();
if(num<0){
System.out.println("negative number");
}else if(num>0){
System.out.println("positive number");
}else
System.out.println("zero");
}
}