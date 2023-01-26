package service;

import java.util.List;

import DAO.Dao;
import DAO.IDao;
import model.Employee;

public class Service implements IService {
	IDao dao = new Dao();

	@Override
	public void insert(Employee e) {
		
		dao.insert(e);
		
	}

	@Override
	public List<Employee> fetchAll() {
		
		return dao.fetchAll();
	}

	@Override
	public void update(Employee e) {
		
		dao.update(e);
		
	}

	@Override
	public void delete(Employee e) {
		dao.delete(e);
		
	}
	
	

}
