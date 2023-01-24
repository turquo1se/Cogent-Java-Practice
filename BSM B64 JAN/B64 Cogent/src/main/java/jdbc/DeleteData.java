package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		
		// 1. load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		//
		try {
			// 2. open the connection
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch64?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root","5T5yyds!@!");
			
			// 3. issue the query
			PreparedStatement ps = conn.prepareStatement("delete from employee where id = 0");
			
			
			// 4. fetch the result
			int x = ps.executeUpdate();
			
			if (x!=0) {
				System.out.println("Data delete successfully");
			} 
			else {
				System.out.println("issue with the query");
			}
			
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				conn.close();
			}
			catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
