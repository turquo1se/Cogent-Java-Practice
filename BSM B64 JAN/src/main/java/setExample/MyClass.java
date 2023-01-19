package setExample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set s = new HashSet();
		
		s.add(1);
		s.add(5);
		s.add(5);
		s.add(100);
		s.add("Hello");
		s.add(null);
		System.out.println(s);
		// no duplicate, not preserving order, not thread safe
		
		Set s1 = new LinkedHashSet();
		s1.add(1);
		s1.add(5);
		s1.add(5);
		s1.add(100);
		s1.add("Hello");
		s1.add(null);
		System.out.println(s1);
		// no duplicate, preserving order, not thread safe
		
		Set s2 = new TreeSet();
		s2.add(1);
		s2.add(5);
		s2.add(5);
		s2.add(100);
		// s2.add("Hello");
		// s2.add(null);
		System.out.println(s2);
		// no duplicate, sorted by default, must be same type
		
		Set s3 = new TreeSet(new NameComparator());
		
		s3.add(new Employee(4, "Delta", 123.3f));
		s3.add(new Employee(5, "Epsilon", 123.3f));
		s3.add(new Employee(1, "Alpha", 123.3f));
		s3.add(new Employee(2, "Beta", 123.3f));
		s3.add(new Employee(3, "Charlie", 123.3f));

		System.out.println(s3);
		
		Set s4 = new HashSet();
		
		s4.add(new Employee(1, "Alpha", 123.3f));
		s4.add(new Employee(1, "Alpha", 123.3f));
		
	
		System.out.println(s4);
		// Hashing -- unique value on behalf of hashCode() and equals method
	}

}
