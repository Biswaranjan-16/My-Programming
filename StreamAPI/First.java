package StreamAPI;

import java.util.ArrayList;
import java.util.stream.Stream;

public class First {
	public static void main(String[] args) {

		// approach-1
		Stream<Integer> str = Stream.of(1, 2, 3, 4, 5, 6);
		ArrayList<String> al = new ArrayList<String>();
		al.add("biswa");
		al.add("biswal");
		System.out.println(al);

		// approach-2
		Stream<String> str1 = al.stream();
	}
}
