package com.stream;

import java.util.*;
import java.util.stream.*;

public class Java8TesterStream {
	
	public static void main(String[] args) {
		

		List<String> strings = Arrays.asList("abc","","bc","efg","abcd","","jkl"); 
		// System.out.println("List :" + strings);
		List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5);
		List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);
		
		
		long emptyString = strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Empty strings: " + emptyString);
		
		long len3String = strings.stream().filter(string -> string.length() == 3).count();
		System.out.println("String length 3: " + len3String);
		
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).toList();
		System.out.println("Filtered list: " + filtered);
		
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(","));
		System.out.println("Merged string: " + mergedString);
		
		List<Integer> squareList = numbers.stream().map(i -> i* i).distinct().toList();
		System.out.println("Squares list: " + squareList);
		System.out.println("original: " + numbers);
		
		IntSummaryStatistics stats = integers.stream().mapToInt((x)-> x).summaryStatistics();
		
		System.out.println("Highest number in list: "+ stats.getMax());
		System.out.println("lowest number in list: "+ stats.getMin());
		System.out.println("sum: "+ stats.getSum());
		System.out.println("avergae: "+ stats.getAverage());
		System.out.println("random: ");
		
		
		
	}
	


}
