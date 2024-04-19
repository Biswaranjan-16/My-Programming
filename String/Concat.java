package String;

public class Concat {

	public static void main(String[] args) {
		String str="biswaranjan ";
		String s1=str.concat("biswal");
		System.out.println(s1);
		StringBuffer s2=new StringBuffer("biswaranjan ");
		s2.append("Biswal");
		System.out.println(s2);
		s2.insert(11, " babu");
		System.out.println(s2);
	}

}
