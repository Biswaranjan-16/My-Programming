package LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person {
	String Name;
	int age;

	Person(String Name, int age) {
		this.age = age;
		this.Name = Name;
	}
}

public class PredicatePersonDemo {
	public static void main(String[] args) {
		Person p1 = new Person("Babu", 23);
		Person p2 = new Person("Tiku", 26);
		Person p3 = new Person("miku", 17);
		Person p4 = new Person("subhu", 16);
		List<Person> persons = Arrays.asList(p1, p2, p3, p4);
		Predicate<Person> predicate = p -> p.age >= 18;
		for (Person person : persons) {
			if (predicate.test(person)) {
				System.out.println(person.Name);
			}
		}
	}
}
