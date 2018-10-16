package schoolofnet.Java_jdbc;

public class Movie {
	private Integer id;
	private String nome;
	
	public Movie() {
	}
	
	public Movie(String nome) {
		this.nome = nome;
	}

	public Movie(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
