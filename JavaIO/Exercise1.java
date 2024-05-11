package JavaIO;

import java.io.File;

public class Exercise1 {

	public static void main(String[] args) {
		File myfile=new File("D:\\Otz full stack\\otz fsd pdf");
		if(myfile.exists()) {
			System.out.println("file already exist\n");
			
		}
		else {
			System.out.println("file didnot exist");
		}
	}

}
