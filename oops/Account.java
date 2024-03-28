package oops;

public class Account {
String accouuntNo;
String cusName;
double balance;
public Account(String accouuntNo,String cusName,double balance) {
	this.accouuntNo=accouuntNo;
	this.cusName=cusName;
	this.balance=balance;
}
void deposite(double amount) {
	balance +=amount;
}
void withdraw(double amount) {
	balance -=amount;
}
public String toString() {
	return accouuntNo;
}
}
class Bank{
   Account[] accounts;

   public Bank(int maxAccount)
   {
      this.accounts = new Account[maxAccount];
   }

   void addAccount(Account account){
      int position =0;
      for(int i=0;i<accounts.length ; i++)
      {
          if(accounts[i] != null)
          {
             position = i;
             break;
          }
      }
      this.accounts[position] = account;
    
   }
   void removeAccount(Account account)
   {
      int position=0;
      for(int i=0;i<accounts.length;i++){
         if(accounts[i].accouuntNo == account.accouuntNo)
         {
             position = i;
             break;
         }
      }  
      for(int i=position;i<accounts.length;i++)
      {
          if(accounts[i+1] !=null){
             accounts[i] = accounts[i+1];
          }else{
            break;
          }       
      }      
   }
   public void DispalyAllAccount(){
       
   }
}
class TestBank{
   public static void main(String[]args)
   {
       Bank Sbi = new Bank(100);
       Account account1 = new Account("Sbi-1","ajay",500);
       Account account2 = new Account("Sbi-2","biswa",1500);
Account account3 = new Account("Sbi-3","deba",1000);
Account account4 = new Account("Sbi-4","Amish Kumar",700);
			Sbi.addAccount(account1 );
			Sbi.addAccount(account2 );
			Sbi.addAccount(account3 );
			Sbi.addAccount(account4 );
   }
 
}