# Java com JDBC

https://www.schoolofnet.com/curso/java/java-e-banco-de-dados/java-com-jdbc-rev2/

---

## <a name="indice">Índice</a>

- [Introdução](#parte1)   
- [JDBC](#parte2)   
- [Criando e configurando nosso projeto](#parte3)   
- [Criando conexão](#parte4)   
- [Tipos de drivers](#parte5)   
- [DDL create e drop table](#parte6)   
- [Fazendo menu aplicação](#parte7)   
- [Criando model movie](#parte8)   
- [Melhorando classe conexão](#parte9)   
- [Trabalhando com DAO](#parte10)   
- [Finalizando DAO](#parte11)   
- [Implementando DAO no menu](#parte12)   



---

## <a name="parte1">Introdução</a>

- JDK 8
- MySQL

[Voltar ao Índice](#indice)

---

## <a name="parte2">JDBC</a>

Java Database Connectivity ou JDBC especifica uma série de funcionalidades básicas que são implementadas pelos Drivers especificamente para cada base de dados.

![Diagrama JDBC](https://github.com/josemalcher/SchoolOfNet-plano-de-estudo-JAVA-DEVELOPER/blob/master/06Java%20com%20JDBC/readme-img/jdbc.png?raw=true)

Mais Leitura sobre: 
- https://www.devmedia.com.br/aprendendo-java-com-jdbc/29116


[Voltar ao Índice](#indice)

---

## <a name="parte3">Criando e configurando nosso projeto</a>

-https://mvnrepository.com/artifact/mysql/mysql-connector-java/6.0.6

- /Java_jdbc/pom.xml
```
<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>6.0.6</version>
</dependency>
```


[Voltar ao Índice](#indice)

---

## <a name="parte4">Criando conexão</a>


```java 
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

```


[Voltar ao Índice](#indice)

---

## <a name="parte5">Tipos de drivers</a>

JDBC tipo 1: foi o primeiro tipo a ser criado, não faz uma conexão real com o banco de dados, mas sim uma conexão com ODBC. Não é muito utilizado hoje em dia por ser escrito em linguagem nativa, o que sacrifica a portabilidade e exige configuração extra no cliente. Ele é composto pelas classes do pacote sun.jdbc.odbc e uma biblioteca de código nativo (não é necessário acessá-la diretamente). Não utilize esse tipo de driver caso tenha outra opção.

JDBC tipo 2: esse tipo de driver eliminou a dependência de ODBC, mas ainda é escrito em linguagem nativa, esse código nativo permite fazer chamadas a uma API cliente do SGBD. Também é necessária a instalação de bibliotecas de código nativo na máquina onde o sistema será executado, assim como o tipo 1. Esse tipo de driver também não é portável.

JDBC tipo 3: totalmente escrito em Java, eliminou a necessidade de bibliotecas de código nativo favorecendo a portabilidade. Esse tipo de driver permite a conversão de chamadas JDBC em chamadas a um protocolo de rede genérico que então pode ser convertido a chamadas à API específica do SGBD.

JDBC tipo 4: também totalmente escrito em Java, utiliza o protocolo de rede proprietário do SGBD, convertendo as chamadas JDBC para chamadas diretas ao SGBD dispensando uma API cliente intermediaria.

FONTE: https://www.devmedia.com.br/jdbc-tutorial/6638



[Voltar ao Índice](#indice)

---

## <a name="parte6">DDL create e drop table</a>

```java
package schoolofnet.Java_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * Hello world!
 *
 */
public class App 
{
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
    	
    	//String sql = "CREATE TABLE IF NOT EXISTS movie (id INTEGER NOT NULL AUTO_INCREMENT, name VARCHAR(255) NOT NULL, PRIMARY KEY (id))";
    	String sql = "DROP TABLE movie";

    	statement.executeUpdate(sql);
    	
    }
}

```

[Voltar ao Índice](#indice)

---

## <a name="parte7">Fazendo menu aplicação</a>

```java
package schoolofnet.Java_jdbc;

import java.sql.SQLException;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("-----------------MENU-------------------");
        System.out.println("1 - Listar filmes");
        System.out.println("2 - Criar novo filme");
        System.out.println("3 - Atualizar um filme");
        System.out.println("4 - Deletar um filme");
        System.out.println("----------------------------------------");

        int choice = scanner.nextInt();
        switch (choice) {
		case 1:
			System.out.println("Inserindo");
			break;

		default:
			System.out.println("Opção Inválida");
			break;
		}
    	 
    	
    }
}

```

[Voltar ao Índice](#indice)

---

## <a name="parte8">Criando model movie</a>

```java
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

```

[Voltar ao Índice](#indice)

---

## <a name="parte9">Melhorando classe conexão</a>

```java
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

```

[Voltar ao Índice](#indice)

---

## <a name="parte10">Trabalhando com DAO</a>

A maioria dos bancos de dados relacionais lida com uma consulta (query) JDBC / SQL em quatro passos:

1- Interpretar (parse) a consulta SQL;  
2- Compilar a consulta SQL;  
3- Planejar e otimizar o caminho de busca dos dados;  
4- Executar a consulta otimizada, buscando e retornando os dados.  

Um Statement irá sempre passar pelos quatro passos acima para cada consulta SQL enviada para o banco.

Já um Prepared Statement pré-executa os passos (1) a (3). Então, ao criar um Prepared Statement alguma pré-otimização é feita de imediato. O efeito disso é que, se você pretende executar a mesma consulta repetidas vezes mudando apenas os parâmetros de cada uma, a execução usando Prepared Statements será mais rápida e com menos carga sobre o banco.

Outra vantagem dos Prepared Statements é que, se utilizados corretamente, ajudam a evitar ataques de Injeção de SQL. Note que para isso é preciso que os parâmetros da consulta sejam atribuídos através dos métodos setInt(), setString(), etc. presentes na interface PreparedStatement e não por concatenação de strings.

Para uma consulta que vai ser executada poucas vezes e não requer nenhum parâmetro, Statement basta. Para os demais casos, prefira PreparedStatement.

(Baseado nesta resposta em inglês e em https://en.wikipedia.org/wiki/Prepared_statement).

FONTE: https://pt.stackoverflow.com/a/99636/2167

```java
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

```



[Voltar ao Índice](#indice)

---

## <a name="parte11">Finalizando DAO</a>

```java
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

```

[Voltar ao Índice](#indice)

---

## <a name="parte12">Implementando DAO no menu</a>


[Voltar ao Índice](#indice)

---