package String;

public class Getchar {
public static  void main(String args[]) {
	String str="biswaranjan";
	char[] arr=new char[10];
	str.getChars(0, 6, arr, 0);
	System.out.print(arr);
}
}
