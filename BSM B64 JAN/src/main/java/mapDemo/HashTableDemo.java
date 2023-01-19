package mapDemo;

import java.util.Map;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map m = new Hashtable();
		// m.put(null, 1); it will throws null pointer exception, null can not be neither key nor value
		m.put(1, 3);
		m.put("hello", 2);
		System.out.println(m);
		// Hashtable is a legacy class, which was added in jdk 1.1 onwards
		// not order prserve
		// thread safe
		
		Map m1 = new LinkedHashMap();
		m1.put(1, 3);
		m1.put("hello", 2);
		m1.put(2, null);
		System.out.println(m1);
		
		Map m2 = new IdentityHashMap();
		m2.put(1, 3);
		m2.put(1, 2);
		m2.put(2, null);
		System.out.println(m2);
		

	}

}
