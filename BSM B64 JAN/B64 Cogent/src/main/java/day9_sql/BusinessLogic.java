package day9_sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BusinessLogic {
	
	public void createTable(Connection conn, String tableName){
		
		PreparedStatement ps;
		
		try {
			ps = conn.prepareStatement("create table " + tableName + ";");
			
			int x = ps.executeUpdate();
			
			if (x!=0) {
				System.out.println("created successfully");
			} 
			else {
				System.out.println("issue with the query");
			}
					
		} catch (SQLException e) {
			System.out.println("error: "+e.getMessage());
		}
	
	}
	
	public void updateTable(Connection conn, String tableName, String statement){
		
		PreparedStatement ps;
		
		try {
			ps = conn.prepareStatement("update " + tableName + " " + statement);
			
			int x = ps.executeUpdate();
			
			if (x!=0) {
				System.out.println("Data updated successfully");
			} 
			else {
				System.out.println("issue with the query");
			}
					
		} catch (SQLException e) {
			System.out.println("error: "+e.getMessage());
		}
		
	}
	
	public void readTable(Connection conn, String statement){
		
		PreparedStatement ps;
		
		try {
			ps = conn.prepareStatement(statement);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getInt("id")+rs.getString("name")+rs.getFloat("salary"));
			}
		    
		    

		} catch (SQLException e) {
			System.out.println("error: "+e.getMessage());
		}
	
	}
	
	public void deleteData(Connection conn, String tableName){
		
		PreparedStatement ps;
		
		try {
			ps = conn.prepareStatement("delete from " + tableName + ";");
			
			int x = ps.executeUpdate();
			
			if (x!=0) {
				System.out.println("delete successfully");
			} 
			else {
				System.out.println(x);
			}
					
		} catch (SQLException e) {
			System.out.println("error: "+e.getMessage());
		}
	
	}
	
	

}
