package LambdaExpression;

import java.util.StringJoiner;

public class StringjoinerDemo {

	public static void main(String[] args) {
		StringJoiner sj1=new StringJoiner("-");
		sj1.add("Biswaranjan");
		sj1.add("Biswal");
		System.out.println(sj1);
		
		
		
		StringJoiner sj2=new StringJoiner("-","(",")");
		sj2.add("Biswaranjan");
		sj2.add("Biswal");
		System.out.println(sj2);
	}

}
