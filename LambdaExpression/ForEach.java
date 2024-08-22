package LambdaExpression;

import java.util.ArrayList;

public class ForEach {
public static void main(String[] args) {
	ArrayList<Integer> ai=new ArrayList<>();
	ai.add(23);
	ai.add(67);
	ai.add(87);
	ai.add(45);
	ai.forEach(i -> System.out.println(i));
}
}
