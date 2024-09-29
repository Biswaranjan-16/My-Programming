package practice;
	import java.util.Scanner;

	public class Fibonacci {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        // Input: number of terms
	        System.out.print("Enter the number of terms: ");
	        int n = sc.nextInt();
	        
	        // Initialize the first two terms of the Fibonacci series
	        int first = 0, second = 1;
	        
	        System.out.print("Fibonacci Series: ");
	        
	        // Print Fibonacci series up to n terms
	        for (int i = 1; i <= n; i++) {
	            System.out.print(first + " ");
	            
	            // Calculate the next term
	            int next = first + second;
	            first = second;
	            second = next;
	        }
	        
	        sc.close();
	    }
	}


