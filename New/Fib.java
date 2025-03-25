package New;

public class Fib {

	public static void main(String[] args) {
		int n1=0,n2=1,n3,temp=5;
		System.out.println(n1 + " " +n2);
		for(int i=1;i<=temp;i++) {
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
		}

	}

}
