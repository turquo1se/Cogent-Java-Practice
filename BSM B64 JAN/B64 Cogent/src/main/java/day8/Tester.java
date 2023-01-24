package day8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Tester {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("alpha", 23, 100);
		Employee e2 = new Employee("beta", 21, 150);
		Employee e3 = new Employee("charlie", 18, 500);
		Employee e4 = new Employee("delta", 25, 200);
		Employee e5 = new Employee("echo", 30, 1100);
		
		List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5);
		
		Stream<Employee> emp_stream = employees.stream();

		List<Employee> sorted_emp = employees.stream().sorted((ei, eii) -> ei.getAge().compareTo(eii.getAge())).toList();
		
		System.out.println(sorted_emp);
		
		// List<Employee> sorted_emp1 = employees.stream().sorted(Comparator.comparingInt(Employee::getAge())).toList();
		
	}

	

}
