package Abstractclass;

public class Test4 {

	public static void main(String[] args) {
		Employee manager =new Manager("Biswa",45000,6700);
		Employee programmer=new Programmer("tiku",13,5,25000);
		manager.displayinfo();
		System.out.println();
		programmer.displayinfo();
	}

}
