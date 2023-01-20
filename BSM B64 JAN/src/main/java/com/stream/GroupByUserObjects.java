package com.stream;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class GroupByUserObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Item> items = Arrays.asList(new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 20, new BigDecimal("19.99")),
				new Item("orange", 10, new BigDecimal("29.99")),
				new Item("watermelon", 10, new BigDecimal("29.99")),
				new Item("papaya", 20, new BigDecimal("9.99")),
				new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 10, new BigDecimal("19.99")),
				new Item("apple", 20, new BigDecimal("9.99")));
		
		// converting list into map, where name where be the key, counting will be value
		Map<String, Long> counting = items.stream()
				.collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
		
		System.out.println(counting);
		
		Map<String, Integer> sum = items.stream()
				.collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
		System.out.println(sum);
		
		// grouping by price
		Map<BigDecimal, List<Item>> groupingByPriceMap = items.stream()
				.collect(Collectors.groupingBy(Item::getPrice));
		System.out.println(groupingByPriceMap);
		
		// group by price, uses mapping to convert List<Item> to Set<String>
		Map<BigDecimal, Set<String>> result = items.stream()
				.collect(Collectors.groupingBy(Item::getPrice, Collectors.mapping(Item::getName, Collectors.toSet())));
		System.out.println(result);
		

	}

}
