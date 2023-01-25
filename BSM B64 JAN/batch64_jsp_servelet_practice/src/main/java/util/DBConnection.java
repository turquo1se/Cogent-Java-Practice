package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection getConnection() {
		
		Connection conn = null;
		
		// 1. load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		// 2. open the connection
		try {		
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch64_day9?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root","5T5yyds!@!");
		}
		catch(SQLException e1) {
			System.out.println(e1.getMessage());
		} 
		
		//finally {
			return conn;
		//}
	}

}
