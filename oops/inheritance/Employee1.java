package oops.inheritance;

 class Employee1 {
String firstName;
String lastName;
	public Employee1(String f,String l) {
		this.firstName=f;
		this.lastName=l;
	}
	public Employee1() {
		
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
}
class Ramu extends Employee1{
	int employeeId;
	String lastname;
	String jobtitle;
	public Ramu(String f,String l,int e,String j) {
		this.employeeId=e;
		this.lastName=l;
		this.jobtitle = jobtitle;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getLastName() {
		return lastName;
	}
	public String  toString(){
        return "Ramu [Employee Id : "+this.employeeId+" , FirstName : "+this.firstName +" , LastName : "+ this.lastName+" , JobTitle : "+this.jobtitle+"]";
     }
}
class e{
	public static <Biju> void main(String args[]) {
		Ramu r=new Ramu("biswaranjan","biswal",234,"hr");
		Employee1 b=new Employee1("biju","nayak");
		System.out.println(r.toString());
		System.out.println(b.toString());
		//System.out.println(r.getFirstName() + " " + r.getLastName() + " (" + r.getEmployeeId() + ")");
	}
}