package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.Iterator;

public class MyClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		
		List l1 = Arrays.asList(10,20);
		
		System.out.println(l);
		System.out.println(l1);
		
		for(int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		for(Integer i: l) {
			System.out.println(i);
		}
		
		
		// using iterator
		System.out.println("=======================================================================");
		Iterator<Integer> itr = l.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
