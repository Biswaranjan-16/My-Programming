import java.util.Scanner;

class Simpleintrest {
  public static void main(String[] args) {

Scanner input = new Scanner(System.in);

    System.out.print("Enter the principle: ");
    int principal = input.nextInt();

    System.out.print("Enter the rate: ");
    int rate = input.nextInt();

    System.out.print("Enter the time: ");
    int time = input.nextInt();

    double interest = (principle * time * rate) / 100;

    System.out.println("Principal: " + principle);
    System.out.println("Interest Rate: " + rate);
    System.out.println("Time Duration: " + time);
    System.out.println("Simple Interest: " + intrest);

    
  }
}