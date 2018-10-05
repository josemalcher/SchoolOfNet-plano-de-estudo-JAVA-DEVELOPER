package schoolofnet.Java_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
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
    	
    	if(connection != null) {
    		System.out.println("CONECTOU!!");
    	}else {
    		System.out.println("FALHA NA CONEXÃO!");
    	}
    	
    }
}
