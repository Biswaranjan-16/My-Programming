package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Teacher{
	int age;
	String name;
	Double salary;
	public Teacher(int age,String name,Double salary) {
		this.age=age;
		this.name=name;
		this.salary=salary;
		
	}
	
}
public class MAX_MIN_AVG {

	public static void main(String[] args) {
		Teacher t1=new Teacher(24,"Biswa",55000.00);
		Teacher t2=new Teacher(29,"tiku",85000.00);
		Teacher t3=new Teacher(27,"miku",65000.00);
		Teacher t4=new Teacher(23,"subhu",45000.00);
		Teacher t5=new Teacher(55,"baba",50000.00);
		Teacher t6=new Teacher(50,"mommy",35000.00);
		
		List<Teacher> teacher=Arrays.asList(t1,t2,t3,t4,t5,t6);
		
		Optional<Teacher> max=teacher.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
		System.out.println("maximum salary ::" +max.get().salary);
		
		Optional<Teacher> min=teacher.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));
		System.out.println("minimum salary ::" +min.get().salary);
		
		Double avg=teacher.stream().collect(Collectors.averagingDouble(e -> e.salary));
		System.out.println("average salary ::" + avg);

	}

}
