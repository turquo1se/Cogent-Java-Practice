package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import util.DBConnection;
import model.Employee;

public class Dao implements IDao{

	public void insert(Employee e) {
		

		
		try {
			Connection conn = DBConnection.getConnection();
			
			PreparedStatement ps = conn.prepareStatement("insert into employee values(?, ?, ?, ?)");
			
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setString(3, e.getDept());
			ps.setFloat(4, e.getSalary());
			
			int x = ps.executeUpdate();
			
			if (x!=0) {
				System.out.println("data inserted");
			} else {
				System.out.println("issue with query");
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
	@Override
	public List<Employee> fetchAll() {
		Connection conn = DBConnection.getConnection();
		List<Employee> li = new ArrayList<Employee>();

		try {
			PreparedStatement ps = conn.prepareStatement("select * from employee");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Employee e = new Employee();
				
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setDept(rs.getString(3));
				e.setSalary(rs.getFloat(4));
				
				li.add(e);				
			}
			
		}
		
		catch(SQLException e1) {
			System.out.println(e1.getMessage());			
	}
		return li;
	}

}
