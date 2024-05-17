package test;

import java.io.*;

abstract class Subject {
	Subject() { 
	System.out.println("Learning Subject"); 
	}

	abstract void syllabus();

	static void Learn(){
		System.out.println("Preparing Right Now!");
	}
}





