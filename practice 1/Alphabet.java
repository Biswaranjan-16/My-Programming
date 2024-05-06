import java.util.Scanner;
class Alphabet{
      public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a character");
         char ch=sc.next().charAt(0);
         if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
             System.out.print(ch+" is an Alphabet ");
         }
         else{
             System.out.print(ch+" is not an Alphabet ");
         }

    }
}