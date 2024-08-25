package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(12, 34, 68, 98, 19);
		Stream<Integer> st = li.stream();
		Stream<Integer> filter = st.filter(i -> i > 20);
		filter.forEach(i -> System.out.println(i));

	}

}
