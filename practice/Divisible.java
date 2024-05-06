import java.util.Scanner;
class Divisible{
     public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        if(num%5==0){
          System.out.println("number is divisible by 5");
         }
         else{
           System.out.println("number is not divisible by 5");
         }
       if(num%11==0){
         System.out.println("number is divisible by 11");
        }
       else{
           System.out.println("number is not divisible by 11");
         }
  }
}