package String;

public class Comparesequence {

	public static void main(String[] args) {
		String str="Biswa";
		String str1="biswa";
		String str3="Biswa";
		boolean str4=str.contentEquals(str3);
		boolean str5=str1.contentEquals(str3);
		System.out.println(str4);
		System.out.println(str5);
	}

}
