package practice;
import java.util.Scanner;
     class Vote{
        public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           System.out.println("enter the age");
           int age=sc.nextInt();
           String result=(age>18)?"eligible":"not eligible";
           System.out.println(result);
    }
}