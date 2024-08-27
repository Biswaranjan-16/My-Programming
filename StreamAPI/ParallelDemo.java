package StreamAPI;

import java.util.stream.Stream;

public class ParallelDemo {
	public static void main(String[] args) {
System.out.println("=======serial========");
Stream<Integer> ss=Stream.of(1,2,3,4);
ss.forEach(s -> System.out.println(s +"::" +Thread.currentThread()));

System.out.println("=====parallel=======");
Stream<Integer> ps=Stream.of(1,2,3,4,5);
ps.parallel().forEach(p ->System.out.println(p +"::" +Thread.currentThread()));
	}
}
