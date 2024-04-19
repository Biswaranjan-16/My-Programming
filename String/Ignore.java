package String;

public class Ignore {

	public static void main(String[] args) {

String str="BISWARANJAN BISWAL";
String str1="biswaranjan biswal";
System.out.println(str);
System.out.println(str1);
int result=str.compareToIgnoreCase(str1);
if(result<0) {
	System.out.println(str+" is greater than "+str1);
}else if(result==0){
	System.out.println(str+" is equals to "+str1);
}else {
	System.out.println(str+" is less than "+str1);
}


	}

}
