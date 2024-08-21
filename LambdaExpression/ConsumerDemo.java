package LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
	Consumer<String> con=(name) -> System.out.println(name +"  Good Morning");
	con.accept("Biswa");
	con.accept("tiku");
	con.accept("miku");
	con.accept("subhu");
	
	List<Integer> numbers=Arrays.asList(10,20,30,40);
	numbers.forEach(i -> System.out.println(i));

	}
}
