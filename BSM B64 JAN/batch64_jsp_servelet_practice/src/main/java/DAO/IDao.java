package DAO;

import java.util.List;

import model.Employee;

public interface IDao {
	
	public void insert(Employee e);
	
	public List<Employee> fetchAll();
	
	public void update(Employee e);
	
	public void delete(Employee e);
 
}
