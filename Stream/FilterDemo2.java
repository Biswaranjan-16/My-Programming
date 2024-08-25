package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo2 {
public static void main(String[] args) {
	
	List<Integer> li=Arrays.asList(11,12,45,76,89,56);
	
	//stream API with lambda
	li.stream().filter(i -> i>20).forEach(i -> System.out.println(i));
	
	//stream API with lambda
	List<String> names=Arrays.asList("biswaranjan","biswajit","miku","subhu","bijay","subasini");
	names.stream().filter(i -> i.startsWith("b")).forEach(i -> System.out.println(i));
}
}
