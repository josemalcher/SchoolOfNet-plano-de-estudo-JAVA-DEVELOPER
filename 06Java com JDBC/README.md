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


[Voltar ao Índice](#indice)

---

## <a name="parte8">Criando model movie</a>


[Voltar ao Índice](#indice)

---

## <a name="parte9">Melhorando classe conexão</a>


[Voltar ao Índice](#indice)

---

## <a name="parte10">Trabalhando com DAO</a>


[Voltar ao Índice](#indice)

---

## <a name="parte11">Finalizando DAO</a>


[Voltar ao Índice](#indice)

---

## <a name="parte12">Implementando DAO no menu</a>


[Voltar ao Índice](#indice)

---