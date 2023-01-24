package com.stream.demo;

import java.util.Optional;

public class OptinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee(100, "alex", "ny");
		
		Optional<String> ename = Optional.ofNullable(e.getName());
		System.out.println(ename.map(String::toUpperCase).orElse("default"));
		
		Employee e1 = new Employee(100, null, "ny");
		
		Optional<String> nullName = Optional.ofNullable(e1.getName());
		System.out.println(nullName.map(String::toUpperCase).orElse("default"));
		
		System.out.println(nullName.map(String::toUpperCase).orElseGet(()->"Default Value"));
		
		// System.out.println(nullName.orElseThrow(()-> new IllegalArgumentException("name not found")));
		
		nullName.ifPresent(g -> System.out.println("value available")); // will not print anything
		
		ename.ifPresent(g -> System.out.println("value available"));
		
		if (ename.isPresent()) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
