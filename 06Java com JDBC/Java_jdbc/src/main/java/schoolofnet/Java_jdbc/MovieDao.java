package schoolofnet.Java_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MovieDao {

	private Connection connection = null;
	private PreparedStatement prestatement= null;
	
	public MovieDao() {
		connection = new ConnectionFactory().getConnection();
	}
	
	public List<Movie> findAll() throws SQLException{
		
		String sql = "SELECT * from movie";
		List<Movie> movies = new ArrayList<Movie>();
		
		prestatement = connection.prepareStatement(sql);
		
		ResultSet res = prestatement.executeQuery();
		
		while(res.next()) {
			movies.add(new Movie(res.getInt("id"), res.getString("nome")));
		}
		
		return movies;
		
	}
	
	public void insert(Movie movie) {
		
	}
	
	public void update(Movie movieOld, Movie MovieNew) {
		
	}
	
	public void remove(Movie movie) {
		
	}
}
