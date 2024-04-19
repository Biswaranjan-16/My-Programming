package String;

public class copyvalue {
	public static void main(String[] args) {
               char[] tr = new char[] { '1', '2', '3', '4','9','6' };

        
        String str = String.copyValueOf(tr, 1, 5);

        
        System.out.println("The book contains " + str + " pages");
    }
}

