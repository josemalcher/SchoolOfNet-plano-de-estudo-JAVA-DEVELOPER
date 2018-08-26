# Api's Nativas no Java

[ Link curso - Api's Nativas no Java](https://www.schoolofnet.com/curso-apis-nativa-no-java/)


Todos sabem que a Linguagem Java é uma das mais utilizadas e completas do mundo. Ela possui uma infinidade de pacotes e API's prontas para nos auxiliar na resolução de problemas do dia a dia. Neste curso aprenderemos a utilizar as principais API's que o Java nos provê.  

---

## <a name="indice">índice</a>

- [Introdução](#parte1)  
- [Nosso ambiente](#parte2)  
- [Criando nosso projeto](#parte3)  
- [Packages](#parte4)  
- [Modificadores de acesso public e private](#parte5)  
- [Modificadores de acesso protected e default](#parte6)  
- [Java lang - Object](#parte7)  
- [Java lang - Classes Wrappers](#parte8)  
- [Java lang - Anotations](#parte9)  
- [Java IO - File](#parte10)  
- [Java IO - FileOuputStream](#parte11)  
- [Java IO - BufferedRead/FileInputStream](#parte12)  
- [Collections - ArrayList](#parte13)  
- [Collections - HashMap](#parte14)  
- [Finalizando](#parte15)  
         


---

## <a name="parte1">Introdução</a>


[Voltar ao Índice](#indice)

---
## <a name="parte2">Nosso ambiente</a>

```
C:\Users\josemalcher>javac -version
javac 1.8.0_161

C:\Users\josemalcher>java -version
java version "10.0.2" 2018-07-17
Java(TM) SE Runtime Environment 18.3 (build 10.0.2+13)
Java HotSpot(TM) 64-Bit Server VM 18.3 (build 10.0.2+13, mixed mode)

C:\Users\josemalcher>mvn -version
Apache Maven 3.5.4 (1edded0938998edf8bf061f1ceb3cfdeccf443fe; 2018-06-17T15:33:14-03:00)
Maven home: C:\Program Files\apache\bin\..
Java version: 1.8.0_161, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk1.8.0_161\jre
Default locale: pt_BR, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```

[Voltar ao Índice](#indice)

---
## <a name="parte3">Criando nosso projeto</a>

- Projeto Maven

```java
package com.schoolofnet.javaNative;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

```

[Voltar ao Índice](#indice)

---
## <a name="parte4">Packages</a>

```java
package com.schoolofnet.javaNative;

import com.schoolofnet.javaNative.main.*;

public class App 
{
    public static void main( String[] args )
    {
        new Main();
    }
}

```

[Voltar ao Índice](#indice)

---
## <a name="parte5">Modificadores de acesso public e private</a>

```java
package com.schoolofnet.javaNative;

import com.schoolofnet.javaNative.private_code.PrivateCode;
import com.schoolofnet.javaNative.public_code.PublicCode;

public class App {
	public static void main(String[] args) {
		new PublicCode();
		new PrivateCode();
	}
}
```

```java
package com.schoolofnet.javaNative.public_code;

public class PublicCode {

	public PublicCode() {
		System.out.println("Publico");
	}
	public void publicoMetodo() {
		System.out.println("Método publicio");
	}
}

```

```java
package com.schoolofnet.javaNative.private_code;

public class PrivateCode {
	public PrivateCode() {
		System.out.println("Public método em PrivateCode");
		metodoPrivado();
	}
	private void metodoPrivado() {
		System.out.println("Privado método (método privado)");
	}
}

```

[Voltar ao Índice](#indice)

---
## <a name="parte6">Modificadores de acesso protected e default</a>

```java
package com.schoolofnet.javaNative.protected_code;

public class ProtectedCode {

	protected String varProtected = "var Protected";
	
	public ProtectedCode() {
		System.out.println("Protected Construtor");
	}
	protected void protectMetodo() {
		System.out.println("Método protected");
	}

}

```

```java
package com.schoolofnet.javaNative.default_code;

class DefaultCode {

	Integer age;
	
	DefaultCode() {
		this.age = 10;
		System.out.println("Default age =" + this.age );
	}

}

```

```java
package com.schoolofnet.javaNative;

//import com.schoolofnet.javaNative.default_code.DefaultCode;
import com.schoolofnet.javaNative.private_code.PrivateCode;
import com.schoolofnet.javaNative.protected_code.ProtectedCode;
import com.schoolofnet.javaNative.public_code.PublicCode;

public class App {
	public static void main(String[] args) {

		new PublicCode();
		new PrivateCode();
		
		new ProtectedCode();
		//new DefaultCode();
	}
}

```


[Voltar ao Índice](#indice)

---
## <a name="parte7">Java lang - Object</a>



[Voltar ao Índice](#indice)

---
## <a name="parte8">Java lang - Classes Wrappers</a>



[Voltar ao Índice](#indice)

---
## <a name="parte9">Java lang - Anotations</a>



[Voltar ao Índice](#indice)

---
## <a name="parte10">Java IO - File</a>



[Voltar ao Índice](#indice)

---
## <a name="parte11">Java IO - FileOuputStream</a>



[Voltar ao Índice](#indice)

---
## <a name="parte12">Java IO - BufferedRead/FileInputStream</a>



[Voltar ao Índice](#indice)

---
## <a name="parte13">Collections - ArrayList</a>



[Voltar ao Índice](#indice)

---
## <a name="parte14">Collections - HashMap</a>



[Voltar ao Índice](#indice)

---
## <a name="parte15">Finalizando</a>



[Voltar ao Índice](#indice)

---