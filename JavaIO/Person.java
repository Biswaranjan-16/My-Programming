package JavaIO;

import java.io.*;

public class Person implements Serializable{
int id;
String name;
Person(int id,String name){
	this.id=id;
	this.name=name;
}}
class emp extends Person{
	int fee;
	String course;
	emp(int id,String name,int fee,String course){
		super(id,name);
		this.course=course;
		this.fee=fee;
	}
}

