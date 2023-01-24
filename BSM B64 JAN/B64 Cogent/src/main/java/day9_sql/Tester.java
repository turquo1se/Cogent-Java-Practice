package day9_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		BusinessLogic bl = new BusinessLogic();
		
		// 1. load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			// 2. open the connection
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch64?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root","5T5yyds!@!");
			
		//bl.createTable(conn, "people(id int(10));");
		bl.readTable(conn, "select * from employee;");
		//bl.updateTable(conn, "employee", "set id=0;");
		//bl.deleteData(conn, "people");

	}	
		catch(SQLException e) {
		System.out.println("Error: " + e.getMessage());
	}		
		finally {
		try {
			conn.close();
		} 
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}	

	}
}
