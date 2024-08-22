package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//without lambda
public class NumberSort {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(20);
		al.add(30);
		al.add(21);
		al.add(32);
		al.add(54);
		System.out.println("Before sort "+al);
		Collections.sort(al,new NumberComparator());
		System.out.println("After sort "+al);
	}
}
class NumberComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer i, Integer j) {
		if(i>j) {
			return -1;
		}else if(i<j) {
			return 1;
		}else {
			return 0;
		}
	}
	
}