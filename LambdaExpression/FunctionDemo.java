package LambdaExpression;

import java.util.function.Function;

public class FunctionDemo {
public static void main(String[] args) {
	Function<String, Integer> f=(name) -> name.length();
	System.out.println(f.apply("Biswa"));
	System.out.println(f.apply("tiku"));
	System.out.println(f.apply("miku"));
	System.out.println(f.apply("subhu"));
}
}
