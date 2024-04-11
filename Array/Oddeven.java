
import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the range to find even and odd numbers (start end): ");
        
        int i = 0;
		int[]num=new int[i];
        System.out.println("Even numbers:");
        for ( i =0; i <= num.length; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
        System.out.println("Odd numbers:");
        for ( i = 0; i <=num[i]; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

