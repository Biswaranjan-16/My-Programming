package practice;
import java.util.Scanner;
                 
public class Calculation{
    public static void main(String args[]) {
  
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter First Number : ");
    int m = scanner.nextInt();
    System.out.print("Enter Sec Number : ");
    int n= scanner.nextInt();

    int add = m + n;
    int sub = m - n;
    int mul = m * n;
    double div = m / n;

    System.out.println("Sum = " + add);
    System.out.println("Difference = " + sub);
    System.out.println("Multiplication = " + mul);
    System.out.println("Division = " + div);
  }
}