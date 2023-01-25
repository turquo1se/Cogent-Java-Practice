package batch64dynamic.service;

import java.util.List;

import batch64dynamic.model.Employee;

public interface EmployeeService {

	public void save(Employee e);

	// public StringBuilder read(String statement);
	
	public List<Employee> fetchAll();
	
}
