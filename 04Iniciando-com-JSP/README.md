# Iniciando com JSP


[ Link curso - Iniciando com JSP](https://www.schoolofnet.com/curso-iniciando-com-jsp//)


Java Server Pages é a forma basica e mais simples que o Java interage com a web. Neste curso daremos inicio ao estudo de JSP, entendendo seus principais conceitos e transformando a linguagem java, bastante comum para desktop em uma linguagem de alto nível web.

---

## <a name="indice">índice</a>

- [Introdução](#parte1)  
- [Nosso ambiente](#parte2)  
- [Servlet](#parte3)  
- [JSP](#parte4)  
- [Criando nosso projeto](#parte5)  
- [O que é Webcontainer / Tomcat](#parte6)  
- [Analisando a Servlet](#parte7)  
- [Request](#parte8)  
- [Response](#parte9)  
- [Filtros](#parte10)  
- [Taglibs/JSTL](#parte11)  
- [Lidando com Erros](#parte12)  
- [Entendendo o ciclo de vida](#parte13)  
- [Finalizando](#parte14)  

         


---

## <a name="parte1">Introdução</a>



[Voltar ao Índice](#indice)

---
## <a name="parte2">Nosso ambiente</a>

- https://www.oracle.com/technetwork/java/javase/downloads/index.html
- https://maven.apache.org/download.cgi



[Voltar ao Índice](#indice)


---
## <a name="parte3">Servlet</a>

Servlets são classes Java, desenvolvidas de acordo com uma estrutura bem definida que quando instaladas e configuradas em um Servidor que implemente um Servlet Container, podem tratar requisições recebidas de clientes Web, como por exemplo os Browsers (Internet Explorer® e Mozilla Firefox®).

Ao receber uma requisição, um Servlet pode capturar os parâmetros desta requisição, efetuar qualquer processamento inerente a uma classe Java, e devolver uma página HTML. - Retirado do Devmedia.

- https://www.caelum.com.br/apostila-java-web/servlets/#5-2-servlets



[Voltar ao Índice](#indice)


---
## <a name="parte4">JSP</a>


JSP é o acrônimo para Java Server Pages, uma linguagem criada pela SUN gratuita, JSP é uma linguagem de script com especificação aberta que tem como objetivo primário a geração de conteúdo dinâmico para páginas da Internet. Podemos ao invés de utilizar HTML para desenvolver páginas Web estáticas e sem funcionalidade, utilizar o JSP para criar dinamismo. É possível escrever HTML com códigos JSP embutidos. Como o HTML é uma linguagem estática, o JSP será o responsável por criar dinamismo. Por ser gratuita e possuir especificação aberta possui diversos servidores que suportam a linguagem, entre eles temos: Tomcat, GlassFish, JBoss, entre outros. O JSP necessita de servidor para funcionar por ser uma linguagem Server-side script, o usuário não consegue ver a codificação JSP, pois esta é convertida diretamente pelo servidor, sendo apresentado ao usuário apenas codificação HTML.

FONTE: https://www.devmedia.com.br/introducao-ao-java-server-pages-jsp/25602

- https://www.caelum.com.br/apostila-java-web/javaserver-pages/index.html


[Voltar ao Índice](#indice)


---
## <a name="parte5">Criando nosso projeto</a>

```jsp


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("Olá Mundo!!");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

```

[Voltar ao Índice](#indice)


---
## <a name="parte6">O que é Webcontainer / Tomcat</a>

O servidor Apache Tomcat é um container Web de código fonte aberto baseado em Java que foi criado para executar aplicações Web que utilizam tecnologias Servlets e JSPs. O servidor Tomcat foi criado inicialmente como um subprojeto da Apache-Jakarta, no entanto, devido a sua alta popularidade, acabou sendo designado para um projeto separado da Apache, sendo assim mantido por um grupo de voluntários da comunidade de código aberto do Java.Apache Tomcat é um servidor bastante estável com todas as características que um container comercial de aplicações web possui.Atualmente as versões que ainda recebem suporte são 5.5x, 6.0x e 7.0x. Versões anteriores a 5.5 ainda encontram-se disponíveis para download no site da Apache, porém estão arquivadas e não possuem mais suporte. Por isso, recomenda-se que os usuários adquiram as últimas versões disponíveis.

https://www.devmedia.com.br/introduzindo-o-servidor-de-aplicacao-apache-tomcat/27939



[Voltar ao Índice](#indice)


---
## <a name="parte7">Analisando a Servlet</a>

[Voltar ao Índice](#indice)


---
## <a name="parte8">Request</a>

- http://localhost:8080/SON-JSP/Hello?name=jose&lastname=malcher
  
```java
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String lastName = request.getParameter("lastname");
		
		out.println("Olá " + name + " "+ lastName);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
```



```java
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String body = request.getReader().lines().reduce("", (acc,actual)->acc+actual);
//		System.out.println(body);
		
		JSONObject json = formatJson(request.getReader());
		System.out.println(json.toString());
		System.out.println(json.get("lastName"));
	}
	private JSONObject formatJson(BufferedReader reader) {
		StringBuffer bs = new StringBuffer();
		String line = null;
		
		try {
			while((line = reader.readLine()) != null) {
				bs.append(line);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
		JSONObject json = new JSONObject(bs.toString());
		return json;
	}
```

[Voltar ao Índice](#indice)


---
## <a name="parte9">Response</a>

```
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	JSONObject json = new JSONObject();
		int i = 10;
		for(int a = 0 ; a < i; a++) {
			json.put("count", a);
		}
		json.put("teste", 50);
		
		response.setContentType("application/json");
		response.getWriter().write(json.toString());
	}
```

```java
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("name","José Malcher JR");
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
		view.forward(request, response);
		
	}
```

```jsp
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>OK!</h1>
<p> Olá ${name} </p>
</body>
</html>
```

[Voltar ao Índice](#indice)


---
## <a name="parte10">Filtros</a>

```java
@WebFilter("/*")
public class MyFilter implements Filter {
```

```java
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		Long initTime = System.currentTimeMillis();
		
		String endPoint = ((HttpServletRequest) request).getRequestURI();
		
		chain.doFilter(request, response);
		
		Long endTime = System.currentTimeMillis();
		Long result = endTime - initTime;
		
		System.out.println(String.format("%d", TimeUnit.MICROSECONDS.toSeconds(result)));
	}
```

[Voltar ao Índice](#indice)


---
## <a name="parte11">Taglibs/JSTL</a>

- https://mvnrepository.com/artifact/jstl/jstl/1.2
- https://www.tutorialspoint.com/jsp/jsp_standard_tag_library.htm

```java
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		request.setAttribute("name","José Malcher JR");
		request.setAttribute("numbers", numbers);
		request.setAttribute("age", 18);
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
		view.forward(request, response);
		
	}
```

```java
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>OK!</h1>
<p> Olá ${name} </p>

<c:forEach var="i" begin="1" end="10">
	Item Number <c:out value="${i}"></c:out><br>
</c:forEach>

<c:forEach var="number" items="${numbers}">
	Item: ${number} <br/>
</c:forEach>

<c:if test="${age >= 18 }">Você pode entrar!</c:if>
<c:if test="${age < 18 }">Entrada não Permitida</c:if>

</body>
</html>
```

[Voltar ao Índice](#indice)


---
## <a name="parte12">Lidando com Erros</a>

```java
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.sendError(404, "Página não encontrada");
}
```

[Voltar ao Índice](#indice)


---
## <a name="parte13">Entendendo o ciclo de vida</a>

- https://www.devmedia.com.br/ciclo-da-vida-do-servlet/27919



[Voltar ao Índice](#indice)


---
## <a name="parte14">Finalizando</a>

[Voltar ao Índice](#indice)

