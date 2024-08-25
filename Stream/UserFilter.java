package Stream;

import java.util.stream.Stream;

class User{
	int age;
	String name;
	
	User(int age,String name){
		this.age=age;
		this.name=name;		
	}

	public String toString() {
		return "User [age=" + age + ", name=" + name + "]";
	}
}
public class UserFilter {

	public static void main(String[] args) {
		User u1=new User(25,"biswa");
		User u2=new User(35,"tiku");
		User u3=new User(23,"miku");
		User u4=new User(22,"subhu");
		User u5=new User(55,"bijay");
		User u6=new User(50,"subasini");
		User u7=new User(25,"ajay");
		
		Stream<User> st=Stream.of(u1,u2,u3,u4,u5,u6,u7);
		
		//single filter
		st.filter(u -> u.age<25).forEach(u -> System.out.println(u));
		
		//double filter
		st.filter(u -> u.age>=25 && u.name.startsWith("b")).forEach(u -> System.out.println(u));
	}

}
