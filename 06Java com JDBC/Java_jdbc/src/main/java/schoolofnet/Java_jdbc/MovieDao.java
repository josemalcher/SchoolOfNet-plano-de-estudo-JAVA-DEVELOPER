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
	
	public void insert(Movie movie) throws SQLException {
		String sql = "INSERT INTO movie (name) VALUES (?)";
		
		prestatement = connection.prepareStatement(sql);
		prestatement.setString(1, movie.getNome());
		prestatement.execute();
	}
	
	public void update(Movie movieOld, Movie MovieNew) throws SQLException {
		String sql = "UPDATE movie SET name = ? WHERE id = ?";
		
		prestatement = connection.prepareStatement(sql);
		prestatement.setString(1, MovieNew.getNome());
		prestatement.setInt(2, movieOld.getId());
		prestatement.execute();
	}
	
	public void remove(Movie movie) throws SQLException {
		String sql = "DELETE FROM movie WHERE id = ?";
		
		prestatement = connection.prepareStatement(sql);
		prestatement.setInt(1, movie.getId());
		prestatement.execute();
	}
}
