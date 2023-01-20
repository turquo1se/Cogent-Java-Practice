package com.stream;

import java.util.*;
import java.util.stream.*;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee("allen", "saving", 1234);
		Employee e2 = new Employee("black", "checking", 2345);
		Employee e3 = new Employee("charlie", "saving", 3456);
		Employee e4 = new Employee("daniel", "credit", 4567);
		
		
		List<Employee> employees = Arrays.asList(e1, e2, e3, e4);
		Stream<Employee> emp_stream = employees.stream();
		
		// suppose I need salary of all employees
		List<Integer> salaries = emp_stream.map(e -> e.getSalary()).toList();
		System.out.println(salaries);
		
		// suppose I need names
		List<String> names = employees.stream().map(e -> e.getName()).toList();
		System.out.println(names);
		
		// suppose I need name of emplyee whose salary is greater 1234
		List<Employee> employees1 = employees.stream().filter(e -> e.getSalary() > 1234).toList();
		System.out.println(employees1);
		
		List<String> names1 = employees1.stream().map(e -> e.getName()).toList();
		System.out.println(names1);
		
		
		List<String> employees2 = employees.stream().filter(e -> e.getSalary() > 1234)
				.map(e -> e.getName()).toList();
		System.out.println(employees2);
		
		// Employee named allen
		List<Employee> employees3 = employees.stream().filter(e -> e.getName() == "allen").toList();
		System.out.println(employees3);
		
		Employee allen = employees.stream().filter(e -> e.getName() == "allen").findFirst().orElse(null);
		System.out.println(allen);
	}

}
