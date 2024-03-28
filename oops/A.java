package oops;
public class A {
	
		  String accountNumber;
		  String accountHolderName;
		  double accountBalance;
		  double withdraw;
		  double deposite;
		  double updateBalance;
		  double updateBlance1;
		  public void setAccount(String n,String h,double b,double w,double d,double u) {
		    accountNumber=n;
		    accountHolderName=h;
		    accountBalance=b;
		    withdraw=w;
		    deposite=d;
		    updateBalance=u;
		    if(accountBalance>=withdraw) {
		      updateBalance=accountBalance-withdraw;
		      updateBlance1=updateBalance+deposite;
		    }
		  }
		  public void getAccount() {
		    System.out.println("Account number :"+accountNumber);
		    System.out.println("Account holder name :"+accountHolderName);
		    System.out.println("account balance :"+accountBalance);
		    System.out.println("withdraw ammount :"+withdraw);
		    System.out.println("deposite ammount :"+deposite);
		    System.out.println("update balance :"+updateBalance);
		    System.out.println("update after deposite :"+updateBlance1);
		  }

		  public static void main(String[] args) {
		    A acc=new A();
		    acc.setAccount("1234"," biswa", 10, 3, 5, 0);
		    acc.getAccount();

		  }

		}


