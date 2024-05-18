package test;

public class TestBank {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.setAccountnumber("sb-123456");
		b.setAccountbalance(76000);
	String Accountnumber=b.getAccountnumber();
		int Accountbalance= b.getAccountbalance();
		System.out.println("Accountnumber :"+Accountnumber);
		System.out.println("Accountbalance :"+Accountbalance);
	}

}
