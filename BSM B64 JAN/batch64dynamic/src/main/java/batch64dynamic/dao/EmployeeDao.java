package batch64dynamic.dao;

import java.util.List;

import batch64dynamic.model.Employee;

public interface EmployeeDao {
	
	public void save(Employee e);

	// public StringBuilder read(String statement);
	
	public List<Employee> fetchAll();

}
