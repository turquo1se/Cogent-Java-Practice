package collection;
import java.util.*;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List l = new ArrayList();
		
		l.add(10);
		
		l.add(20);
		
		l.add(30);
		l.add(40);
		l.add("hello");
		l.add(10.89);
		
		System.out.println(l);
		System.out.println(l.get(3));
		System.out.println(l.remove(0));
		System.out.println(l);
		System.out.println(l.remove("Hello"));
		System.out.println(l);
		l.add(2, "welcome");
		System.out.println(l.hashCode());
		
	}

}
