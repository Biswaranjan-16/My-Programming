package Encapsulation;

public class Employee {
private String employeeName;
private int employeeId;
private String employeeSalary;
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(String employeeSalary) {
	this.employeeSalary = employeeSalary;
}
//public String tostring() {
//	return "["+"employee id"+getEmployeeId()+"employee name :"+getEmployeeName()+"employee salary:"+getEmployeeSalary()+"]";
//}
}
