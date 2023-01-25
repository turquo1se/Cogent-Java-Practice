package service;

import java.util.List;

import DAO.Dao;
import DAO.IDao;
import model.Employee;

public class Service implements IService {

	@Override
	public void insert(Employee e) {
		IDao dao = new Dao();
		dao.insert(e);
		
	}

	@Override
	public List<Employee> fetchAll() {
		IDao dao = new Dao();
		return dao.fetchAll();
	}
	
	

}
