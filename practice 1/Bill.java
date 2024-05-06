import java.util.Scanner;
class Bill{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
	int unit=0 ;
	double price=0;
	System.out.println("enter preReading");
	int preReading=sc.nextInt();
	System.out.println("enter curReading");
	int curReading=sc.nextInt();

	if(preReading>curReading){
		System.out.println("invalid input !! try again");
	}else{
		unit=curReading-preReading;

           if(unit>0 && unit<=100){
		price=unit*2.5;
	   }
	   else if(unit>100 && unit<=200){
		price=price+(unit-100)*3;
	   }
	   else if(unit>200 && unit<=400){
		price=price+(unit-200)*5;
	   }
	   else{
		price=price+(unit-400)*7;
	   }
	   System.out.println("----BILL DETAILS---");
	   System.out.println("***********************");
 	   System.out.println("Previous Reading :"+ preReading);
 	   System.out.println("Current Reading :"+ curReading);
 	   System.out.println("Unit of Usage :"+ unit);
 	   System.out.println("Total Price to Pay :"+ price);
       }
   }
}
