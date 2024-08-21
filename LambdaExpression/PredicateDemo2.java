package LambdaExpression;

import java.util.function.Predicate;

public class PredicateDemo2 {
	public static void main(String[] args) {
		
	
String[] names= {"Biswaranjan","subhu","Biswajit","Ranjita"};
Predicate<String> p= name -> name.charAt(0)=='B';

for(String name:names) {
	if(p.test(name)) {
		System.out.println(name);
	}
}
}
}