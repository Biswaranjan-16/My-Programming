package LambdaExpression;

@FunctionalInterface
interface Biswa {
	public void m1();
}

public class First {

	public static void main(String[] args) {

		Biswa b = () -> System.out.println("m1......");
		b.m1();
	}
}
