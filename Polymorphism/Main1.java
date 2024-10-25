package Polymorphism;

class Main1 {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Main calc = new Main();
        System.out.println(calc.add(10, 20));       // Calls method with 2 parameters
        System.out.println(calc.add(10, 20, 30));   // Calls overloaded method with 3 parameters
    }
}
