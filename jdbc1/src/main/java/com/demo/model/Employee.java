package com.demo.model;
import java.sql.Connection;
import java.sql.Statement;
import com.demo.util.DbConnection;


public class Employee {
public static boolean createTable() {
	boolean res=false;
	try {
	Connection con=DbConnection.getcon();	
	String query="create table Employee(empId int primary key auto_increment,empName varchar(100),empEmail varchar (100),empAdd varchar(100))";
	Statement st=con.createStatement();
	res=st.execute(query);
	con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return res;
}
public int insertEmployee(String empName,String empEmail,String empAdd) {
	int status=0;
	try {
		Connection con=DbConnection.getcon();
		String query="insert into Employee(empName,empEmail,empAdd) values ('"+empName+"','"+empEmail+"','"+empAdd+"')";
		Statement st=con.createStatement();
		status=st.executeUpdate(query);
		con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return status;
}
public int deleteEmployee(int empId) {
	int s=0;
	try {
		Connection con=DbConnection.getcon();
		String query="delete from Employee where empId="+empId;
		Statement st=con.createStatement();
		s=st.executeUpdate(query);
		con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return s;
}
//public int updateEmployee(int empId) {
//	int u=0;
//	try {
//		Connection con=DbConnection.getcon();
//		String query="update from Employee where empId="+empId;
//		Statement st=con.createStatement();
//		u=st.executeUpdate(query);
//		con.close();
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	return u;
//}
public int updateStudent(int empId,String empName,String empEmail,String empAdd) {
	int result=0;
	try {
		Connection con=DbConnection.getcon();
		String query="update student set empName='"+empName+"',empEmail='"+empEmail+"',empAdd= '"+empAdd+"' where empId="+empId;
		Statement st=con.createStatement();
		result=st.executeUpdate(query);
		con.close();
	} catch (Exception e) {
		e.printStackTrace();	
		}
	return result;
}
public static void main(String[] args) {
	//boolean res=createTable();
	Employee emp=new Employee(); 
//	int status=emp.insertEmployee("Manoranjan", "mano@gmail.com", "bdk");
//	if(status==1) {
//		System.out.println("Employee succesfully inserted");
//	}else {
//		System.out.println("Failed....");
//	}
//	int s=emp.deleteEmployee(3);
//	if(s==1) {
//		System.out.println("Employee succesfully deleted");
//	}else {
//		System.out.println("Failed....");
//	}
//	int u=emp.insertEmployee("lipu", "lipu@gmail.com", "bls");
//	if(u==1) {
//		System.out.println("Employee succesfully update");
//	}else {
//		System.out.println("failed");
//	}
	emp.updateStudent(5, "hari", "hari@gmail.com", "ctc");
	int result = 0;
	if(result==1) {
		System.out.println("successful");
	}else {
		System.out.println("failed");
	}
	}
}

