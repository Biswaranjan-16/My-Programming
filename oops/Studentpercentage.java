package oops;
import java.util.Scanner;
public class Studentpercentage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total class");
		float totalclass=sc.nextInt();
		System.out.println("No, of classes attended: ");
		float classattended=sc.nextInt();
		System.out.println("Percentage of attendance: ");
	    float poa= (float)((classattended/totalclass)*100);
		System.out.println(poa);
		if(poa>=75) {
			System.out.println("allowed for exam");
		}else {
			System.out.println("not allowed for exam");
		}	


	}

}
