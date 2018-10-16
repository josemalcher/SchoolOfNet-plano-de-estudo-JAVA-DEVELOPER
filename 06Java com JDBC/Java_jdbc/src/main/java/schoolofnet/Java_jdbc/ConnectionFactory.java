package schoolofnet.Java_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private final String URL = "jdbc:mysql://localhost:3306/schoolofnet_javajdbc?serverTimezone=UTC";
	private final String USER = "root";
	private final String PASS = "";
	private final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	
	private Connection createConnection() throws ClassNotFoundException {
		Connection connection = null;
		
		try {
			Class.forName(DRIVER_CLASS);
			connection = DriverManager.getConnection(URL, USER, PASS);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	public Connection getConnection() {
		try {
			return createConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
}
