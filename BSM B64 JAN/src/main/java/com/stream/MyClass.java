package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyClass {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> even_list = even(list);
		
		Predicate<Integer> pre = i->i>9;
		
		
		Stream<Integer> stream = list.stream(); // converting list into stream object
		List<Integer> even_stream = stream.filter(i -> i % 2 == 0).collect(Collectors.toList()); // stream api approach 1, using lambda expression
		
		
		List<Integer> even_stream1 = list.stream().filter(i -> i % 2 == 0).toList(); // stream api 
		
		
		
		System.out.println(even_list);
		System.out.println(even_stream);
		System.out.println(even_stream1);
		even_stream.forEach(i->System.out.println(i));
	}
	
	
	static List<Integer> even(List<Integer> li) { // traditional approach
		
		List<Integer> ret = new ArrayList<Integer>();
		
		for(Integer i:li) {
			if (i % 2 == 0) {
				ret.add(i);
			}
		}
		
		return ret;
	}

}

// Stream API -- It is work on top of collection(List, set, map ...) frame work
// Stream is an interface
