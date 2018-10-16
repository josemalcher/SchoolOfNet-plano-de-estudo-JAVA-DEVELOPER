package schoolofnet.Java_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SetupdataBase {
	 public static void main( String[] args ) throws SQLException
	    {
	        
	    	try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Loading DRIVER........");
			} catch (ClassNotFoundException e) {
				System.out.println("FALHA AO CARREAGAR O DRIVER");
				e.printStackTrace();
			}
	    	
	    	Connection connection = null;
	    	String URL = "jdbc:mysql://localhost:3306/schoolofnet_javajdbc?serverTimezone=UTC";
	    	String USER = "root";
	    	String PASS = "";
	    	try {
				connection = DriverManager.getConnection(URL, USER, PASS);
			} catch (SQLException e) {
				e.printStackTrace();
			}
	    	
	    	if(connection == null) {
	    		System.out.println("FALHOU!!");
	    		return;
	    	}
	    	
	    	Statement statement = connection.createStatement();
	    	
	    	String sql = "CREATE TABLE IF NOT EXISTS movie (id INTEGER NOT NULL AUTO_INCREMENT, name VARCHAR(255) NOT NULL, PRIMARY KEY (id))";
	    	//String sql = "DROP TABLE movie";

	    	statement.executeUpdate(sql);
	    	
	    }
}
