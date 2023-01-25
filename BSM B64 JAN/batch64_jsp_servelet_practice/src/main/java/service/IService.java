package service;

import java.util.List;

import model.Employee;

public interface IService {
	
	public void insert(Employee e);
	
	public List<Employee> fetchAll();

}
