import java.util.Scanner;
	class E{
		public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int daynum=0;
		System.out.println("enter day number :");
	daynum=sc.nextInt();
	switch(daynum){
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thrudday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("satarday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default:
			System.out.println("invalid");
	   }

       }
  }