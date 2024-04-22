package String;

public class Practice2 {

	public static void main(String[] args) {
		String s1="Welcome to java";
		String s2=s1;
		String s3=new String("Welcome to java");
		String s4="Welcome to java";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println("Welcome to java".replace("java", "HTML"));
		System.out.println(s1.replace("o", "abc"));
		System.out.println(s1.replaceAll("o","T"));
		System.out.println(s1);
		System.out.println(s1.replaceFirst("o","T"));
		System.out.println(s1.toCharArray());
		System.out.println(s1);
		System.out.println(s2);
	}

}
