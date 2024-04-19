package String;

import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        String concatenatedString = firstString.concat(secondString);

        System.out.println("Concatenated string: " + concatenatedString);

        scanner.close();
    }
}

