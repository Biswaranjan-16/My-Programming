package JavaIO;

import java.io.*;

public class Depersist {
public static void main(String args[]) {
	try {
		 ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
		  Student s2=(Student)in.readObject();  
		  System.out.println(s2.id+" "+s2.name);  
		  
		  in.close(); 
		  
		  }catch(Exception e){
			  System.out.println(e);
			  
		  }  
	}

}
