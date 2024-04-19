package String;

public class Compare {

	public static void main(String[] args) {
		String str1="Biswaranjan biswal";
		String str2="Ajay sethy";
		System.out.println(str1);
		System.out.println(str2);
		int cmp=str1.compareTo(str2);
		int result;
		if(cmp<0) { 
			System.out.println(str1+" is graeater than "+str2);
		}else if(cmp==0) {
			System.out.println(str1+"is equal to "+str2);
		}else {
			System.out.println(str1+" is less than "+str2);
		}

	}

}
