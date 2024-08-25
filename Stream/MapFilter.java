package Stream;

import java.util.Arrays;
import java.util.List;

public class MapFilter {

	public static void main(String[] args) {
	List<String> li=Arrays.asList("biswa","bijay","tiku","subhu","miku");
	
	li.stream().filter(i -> i.startsWith("b"))
	           .map(i  -> i+ "-"+i.length())
	           .forEach(i -> System.out.println(i));

	}

}
