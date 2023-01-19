package collection;

import java.util.ListIterator;
import java.util.Iterator;
import java.util.LinkedList;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l = new LinkedList(); // ListIterator can not be used on set
		l.add("Allen");
		l.add("Black");
		l.add("James");
		l.add("Irfan");
		System.out.println(l);
		Iterator<String> ltr = l.listIterator();
		
		while (ltr.hasNext()) {
			String s = ltr.next();
			if (s.equals("Irfan")) {
				ltr.add("Rohit");
			}
		}
		System.out.println(l);
	}

}
// ListIterator has below methods
//boolean hasNext();
//boolean hasPrevious();
//Object next();
//Object previous();
//int nextIndex();
//int previousIndex();
//void remove();
//void set(Object new)
