package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Sliceingdemo {
public static void main(String[] args) {
	List<String> li=Arrays.asList("java","python","dbms","sql");
	
	li.stream().distinct().forEach(i -> System.out.println(i));
	
	li.stream().limit(3).forEach(i -> System.out.println(i));
	
	li.stream().skip(1).forEach(i -> System.out.println(i));
}
}
