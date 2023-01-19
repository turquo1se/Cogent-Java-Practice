package collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Second {
	
	public static void main(String[] args) {
		
		List<Employee> l = new LinkedList<Employee>();
		
		l.add(new Employee(2, "Black", 112.23f));
		
		l.add(new Employee(1, "Allen", 111.23f));
		
		l.add(new Employee(3, "Carl", 113.23f));
		
		l.add(new Employee(5, "Ellen", 115.23f));
		
		l.add(new Employee(4, "Danile", 114.23f));
		
		
		
		System.out.println(l);
		
		// System.out.println(l.get(1));

		// Collections.sort(l); // sorting can be possible only on same type of elements, if we have different type of element, we will get ClassCastException
		Collections.sort(l, new NameComparator()); // for sorting the class which we are adding in list, that should be comparable or comparator type. otherwise will get class cast
												   // exception
		
		System.out.println(l);
	}
	// rule for sorting
	// 1. Element should be the same type -- ClassCastException
	// 2. null is not allowed -- NullPointerException
	// 

}
