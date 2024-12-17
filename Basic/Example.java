package Basic;

public class Example {
    static int counter = 0; 

    public Example() {
        counter++;
    }

    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();
        System.out.println("Number of objects created: " + Example.counter); 
    }
}
