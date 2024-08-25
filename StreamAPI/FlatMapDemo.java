package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {
public static void main(String[] args) {
	List<String> java=Arrays.asList("java","spring","advanced java");
	List<String> ui=Arrays.asList("html","js","bootstrap");
	
	List<List<String>>courses=Arrays.asList(java,ui);
	
	Stream<String> flatmap=courses.stream().flatMap(s ->s.stream());
	flatmap.forEach(c -> System.out.println(c));
}
}
