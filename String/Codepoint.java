package String;

public class Codepoint {

	public static void main(String[] args) {
		String str="Biswaranjan biswal";
		System.out.println("orininal string "+str);
		int cdp=str.codePointCount(1, 9);
		System.out.println("Codepoint count = " + cdp);

	}

}
