package Accenture;

import java.util.Scanner;

public class SquarePlots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the total number of plots: ");
        int n = scanner.nextInt();

        
        System.out.println("Enter the areas of the plots :");
        int[] areas = new int[n];
        for (int i = 0; i < n; i++) {
            areas[i] = scanner.nextInt();
        }

        
        int squareCount = 0;
        for (int area : areas) {
            int sqrt = (int) Math.sqrt(area);
            if (sqrt * sqrt == area) {
                squareCount++;
            }
        }

        System.out.println("Number of square-shaped plots: " + squareCount);
    }
}
