package com.java8.lambda;


@FunctionalInterface
public interface My1 {
	
	void test();
	
	default void test1() { // from java 8, you can have a body of function with default keyword
		System.out.println("default method");
	}
	
	static void testStatic() { // from java 8, you can have a body of function with static keyword
		
	}
	
	// difference between static and default, static method in interface cannot be override

	
	// functional interface -- An Interface that contains exactly one abstract method, and more than one default methods
	
	
	
	
}
