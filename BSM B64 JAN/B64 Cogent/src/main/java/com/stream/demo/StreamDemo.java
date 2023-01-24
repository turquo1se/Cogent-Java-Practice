package com.stream.demo;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> elist = Arrays.asList(new Employee(101,"allen","ny"), 
				new Employee(102, "black", "py"), 
				new Employee(103, "james", "uk"));
		
		Employee emp = elist.stream().filter(e->e.getAddress()=="uk").findFirst().orElse(null);
		

	}

}
