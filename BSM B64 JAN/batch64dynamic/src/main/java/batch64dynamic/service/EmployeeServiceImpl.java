package batch64dynamic.service;

import java.util.ArrayList;
import java.util.List;

import batch64dynamic.dao.EmployeeDao;
import batch64dynamic.dao.EmployeeDaoIMPL;
import batch64dynamic.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	
	EmployeeDao employeeDao = new EmployeeDaoIMPL();

	@Override
	public void save(Employee e) {
		employeeDao.save(e);
		
	}

	@Override
	public List<Employee> fetchAll() {


		return employeeDao.fetchAll();
	}

	/*
	 * @Override public StringBuilder read(String statement) { StringBuilder sb =
	 * employeeDao.read(statement); return sb;
	 * 
	 * }
	 */
	
	

}
