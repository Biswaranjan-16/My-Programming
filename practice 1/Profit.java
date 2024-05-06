import java.util.Scanner;
class Profit{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter cost price");
int cp=sc.nextInt();
System.out.println("Enter selliing price");
int sp=sc.nextInt();
if(sp>cp){
System.out.println("profit");
}else{
System.out.println("loss");
}
}
}