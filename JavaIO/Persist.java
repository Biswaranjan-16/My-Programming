package JavaIO;
import java.io.*;
class Persist{    
	 public static void main(String args[]){    
	  try{    
	  Student s1 =new Student(32,"Biswa");    
	  FileOutputStream fout=new FileOutputStream("f.txt");    
	  ObjectOutputStream out=new ObjectOutputStream(fout);    
	  out.writeObject(s1);    
	  out.flush();    
	  out.close();    
	  System.out.println("success");    
	  }catch(Exception e){
		  System.out.println(e);
		  }    
	 }    
	}    