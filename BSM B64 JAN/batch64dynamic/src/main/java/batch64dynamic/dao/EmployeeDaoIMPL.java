package batch64dynamic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import batch64dynamic.model.Employee;
import batch64dynamic.utility.DBConnection;

public class EmployeeDaoIMPL implements EmployeeDao{

	@Override
	public void save(Employee e) {
		
		System.out.println("from employeedao impl"+e);
		
		Connection conn = DBConnection.getConnection();

		try {
			PreparedStatement ps = conn.prepareStatement("insert into employee values(?, ?, ?, ?, ?)");
			
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setFloat(3, e.getSalary());
			ps.setString(4, e.getAddress());
			ps.setString(5, e.getMobile());
			
			
			
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
				e.setSalary(rs.getInt(3));
				e.setAddress(rs.getString(4));
				e.setMobile(rs.getString(5));
				
				li.add(e);				
			}
			
		}
		
		catch(SQLException e1) {
			System.out.println(e1.getMessage());			
	}
		return li;
	
	
	

/*	@Override
	public StringBuilder read(String statement) {
		StringBuilder sb = null;
		
		Connection conn = DBConnection.getConnection();

		try {
			PreparedStatement ps = conn.prepareStatement(statement);
			
			
			ResultSet res = ps.executeQuery();
			
			while(res.next()) {
				sb.append("ID: "+ res.getInt(1) + "Name: " + res.getString(2) + 
						"Salary: " +res.getFloat(3) + "Address: " +res.getString(4) +"Mobile: " + res.getString(5));
				sb.append("\n");
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return sb;*/
		
		
	}

}
