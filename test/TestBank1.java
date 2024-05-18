package test;

public class TestBank1 {

	public static void main(String[] args) {
		Bank1 b1=new BankAi(100);
		System.out.println(b1.getbalance());
		Bank1 b2=new BankB(100);
		System.out.println(b2.getbalance());
		Bank1 b3=new BankC(100);
		System.out.println(b3.getbalance());
		

	}

}
