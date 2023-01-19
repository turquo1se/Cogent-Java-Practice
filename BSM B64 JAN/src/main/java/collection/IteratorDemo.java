package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<Integer>(); // iterator can be used on set, list 
		for(int i = 0; i <= 10; i++) { 
			
			al.add(i);
		}
		
		System.out.println(al);
		
		Iterator<Integer> itr = al.iterator();		
		
		while (itr.hasNext()) {			
			Integer i = itr.next();
			if ((i % 2) == 0) {
				System.out.println(i);
			} else {
				itr.remove();
			}
		}
		
		System.out.println(al);

	}

}
