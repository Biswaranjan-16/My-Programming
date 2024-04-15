package Encapsulation;

 class test {
public static void main(String[] args) {
 
	Account account = new Account();

 
 account.setAccountnumber("SB-09876t755757");
 account.setBalance(2000.0);

 String accountNumber = account.getAccountnumber();
 double balance = account.getBalance();

  System.out.println("Account Number: " + accountNumber);
 System.out.println("Balance: " + balance);
	}
}

