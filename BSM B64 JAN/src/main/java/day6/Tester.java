package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee(1, "Alpha", 30, "CS", 100.0);
		Employee e2 = new Employee(1, "Beta", 18, "CS", 100.0);
		Employee e3 = new Employee(1, "Charlie", 20, "CS", 100.0);
		Employee e4 = new Employee(1, "Delta", 17, "CS", 100.0);
		Employee e5 = new Employee(1, "Epsilon", 10000, "CS", 100.0);
		

		BusinessLogic bl = new BusinessLogic();
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		TreeSet<Employee> tree = new TreeSet<Employee>(new AgeComparator());
		
		al = bl.process(al, e1, e2, e3, e4, e5);
		System.out.println(al);
		
		Collections.sort(al, new AgeComparator());
		System.out.println(al);
		tree = bl.process(tree, e1, e2, e3, e4, e5);

		
		
		System.out.println(tree);
		
		
	}

}
