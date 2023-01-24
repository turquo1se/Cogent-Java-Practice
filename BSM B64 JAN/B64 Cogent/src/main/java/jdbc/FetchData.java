package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchData {

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
			PreparedStatement ps = conn.prepareStatement("select * from employee");
			
			
			// 4. fetch the result
			ResultSet rs =ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " | " + rs.getString(2) + " | " + rs.getFloat(3) + " | " +rs.getString(4)+ " | " +rs.getString(5));
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
