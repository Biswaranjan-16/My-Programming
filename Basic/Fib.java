package Basic;

public class Fib {

	public static void main(String[] args) {
		int n=5;
		int n1=0,n2=1;
		for(int i=0;i<=n;i++) {
			System.out.print(n1+" ");
			int next=n1+n2;
			n1=n2;
			n2=next;
		}

	}

}
