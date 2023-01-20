package com.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");
		
		Map<String, Long> result = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(result + "-->");
		
		Map<String, Long> finalMap = new LinkedHashMap<>();
		
		result.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
		.forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
		
		System.out.println(finalMap);
		System.out.println(result);
		
	}

}
