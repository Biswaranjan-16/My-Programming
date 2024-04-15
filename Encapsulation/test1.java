package Encapsulation;

public class test1 {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmployeeId(154);
		emp.setEmployeeName("Biswa");
		emp.setEmployeeSalary("54000");
emp.getEmployeeId();
emp.getEmployeeName();	
emp.getEmployeeSalary();
System.out.println("Employee id :"+emp.getEmployeeId());
System.out.println("Employee name :"+emp.getEmployeeName());
System.out.println("Employee salary :"+emp.getEmployeeSalary());
	}

}
