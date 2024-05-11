package JavaIO;

import java.io.*;

public class test {

	public static void main(String[] args) {
		try {
			emp e1=new emp(211,"ravi",50000,"Engineering");
			FileOutputStream  fout=new FileOutputStream ("f.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);    
			  out.writeObject(e1);    
			  out.flush();   
			  out.close();    
			  System.out.println("success");    
			  }catch(Exception e){
				  System.out.println(e);
			  } 
		     try{    
			     
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));    
			  emp e=(emp)in.readObject();    
			System.out.println(e.id+" "+e.name+" "+e.course+" "+e.fee);    
			  
			  in.close();    
			  }catch(Exception e){System.out.println(e);}  
		}

	}


