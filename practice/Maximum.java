package practice;
import java.util.Scanner;
class Maximum{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter First number");
      int num1=sc.nextInt();
      System.out.println("Enter Second number");
      int num2=sc.nextInt();
      if(num1>num2){
        System.out.println("Maximun number is"+num2);
      }
      else{
        System.out.println("Minimun number is"+num1);
      }
   }
 }