package Stream;

import java.util.Arrays;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {
		List<String> li=Arrays.asList("india","russia","uk","usa");
		
		li.stream().map(i -> i.toUpperCase()).forEach(i -> System.out.println(i));
		
		li.stream().mapToInt(i ->i.length()).forEach(i -> System.out.println(i));

	}

}
