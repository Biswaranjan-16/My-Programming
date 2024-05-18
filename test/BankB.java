package test;

class BankB extends Bank1{
	int balance;
	BankB(int balance){
		this.balance=balance;
	}
	int getbalance() {
	
		return balance +100 ;
	}
	
}