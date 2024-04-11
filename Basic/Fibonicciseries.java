public class Fibonicciseries {

	public static void main(String[] args) {
	int n1=0,n2=1,n3,temp = 20;
	System.out.print(n1 + " "+n2);
	for(int i=2;i<temp;++i) {
		n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		}

	}

}

