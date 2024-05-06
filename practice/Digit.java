import java.util.Scanner;
class Digit{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num =sc.nextInt();
while (num > 0) {
num=num % 10;
System.out.println(num);
num=num/10;
}
}
}