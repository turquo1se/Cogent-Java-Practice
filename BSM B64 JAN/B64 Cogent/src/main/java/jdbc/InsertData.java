package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
	
	public static void main(String[] args) {
		
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
			PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?,?)");
			
			ps.setInt(1, 110);
			
			ps.setString(2, "black");
			
			ps.setFloat(3, 12223.45f);
			
			ps.setString(4, "USA");
			
			ps.setString(5, "123456789011");
			
			//4. execute the query
			int x = ps.executeUpdate();
			
			// 5. fetch the result
			if (x!=0) {
				System.out.println("Data inserted successfully");
			} 
			else {
				System.out.println("issue with the query");
			}
			
		} 
		catch(SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		// 7. close the connection
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
// jar -- mysql connector

// jdbc throws checked exception, classNotFoundException, SQLException

// 1. load the driver
// 2. open the connection
// 3. issue the query
// 4. execute the query
// 5. fetch the result
// 7. close the connection