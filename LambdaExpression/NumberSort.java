package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;

//with lambda
public class NumberSort {
public static void main(String[] args) {
	ArrayList<Integer> ai=new ArrayList<>();
	ai.add(23);
	ai.add(21);
	ai.add(98);
	ai.add(65);
	System.out.println("before sort "+ai);
	Collections.sort(ai, (i,j) ->(i<j) ? -1:1);
	System.out.println("after sort "+ai);
	
}
}
