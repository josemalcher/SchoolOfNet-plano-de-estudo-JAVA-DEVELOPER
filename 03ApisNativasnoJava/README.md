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

```java
package com.schoolofnet.javaNative.public_code;

public class PublicCode {

	public PublicCode() {
		System.out.println("Publico");
	}
	public void publicoMetodo() {
		System.out.println("Método publicio");
	}
	
	@Override
	public String toString() {
		return "Public_code class to String";
	}

}

```

```java
package com.schoolofnet.javaNative;

//import com.schoolofnet.javaNative.default_code.DefaultCode;
//import com.schoolofnet.javaNative.private_code.PrivateCode;
//import com.schoolofnet.javaNative.protected_code.ProtectedCode
import com.schoolofnet.javaNative.public_code.PublicCode;

public class App {
	public static void main(String[] args) {

		//new PublicCode();
		//new PrivateCode();
		//New ProtectedCode();
		//new DefaultCode();
		
		Object obj = new Object();
		PublicCode pub = new PublicCode();
		
		System.out.println(obj.toString());
		System.out.println(pub.toString());

	}
}

```

[Voltar ao Índice](#indice)

---
## <a name="parte8">Java lang - Classes Wrappers</a>


Wrappers vem do verbo inglês “wrap” que significa envolver. Eles são um nome adicional ao padrão de projeto Decorator. Tem como principal função “envolver coisas” adicionando funcionalidades à ela.

O Java conta com diversos Wrappers que adicionam funcionalidades a outras classes ou tipos primitivos, um exemplo dele é o Integer, que é o Wrapper do tipo primitivo int. Que tipo de funcionalidade você pode executar tendo apenas uma variável definida como “int”? Nenhuma, a não ser atribuir valores, pois int é um tipo primitivo e não possuí métodos.

Com o Wrapper Integer envolvendo o tipo primitivo int você consegue executar métodos como é o caso do: parseInt, valueOf e assim por diante.

FONTE: https://www.devmedia.com.br/introducao-aos-wrappers-em-java/28605


```java
package com.schoolofnet.javaNative;
public class App {
	public static void main(String[] args) {
		Integer one = 0;
		int two = 0;
		
		Double d1 = 0.0;
		String str = d1.toString();
	}
}

```

[Voltar ao Índice](#indice)

---
## <a name="parte9">Java lang - Anotations</a>

https://www.devmedia.com.br/entendendo-anotacoes-em-java/26772

https://www.devmedia.com.br/como-criar-anotacoes-em-java/32461

```java
package com.schoolofnet.javaNative;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Info {
	String createBy() default "José Malcher ";	
}

```

```java
package com.schoolofnet.javaNative.public_code;

import com.schoolofnet.javaNative.Info;

//@Info(createBy = "Malcher Jr.")
@Info
public class PublicCode {

	public PublicCode() {
		System.out.println("Publico");
	}
	public void publicoMetodo() {
		System.out.println("Método publicio");
	}
	
	@Override
	public String toString() {
		return "Public_code class to String";
	}

}

```

```java
package com.schoolofnet.javaNative;

import com.schoolofnet.javaNative.public_code.PublicCode;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Annotation;

public class App {
	public static void main(String[] args) {
		Class<PublicCode> obj = PublicCode.class;
		if(obj.isAnnotationPresent(Info.class)) {
			Info annotation = obj.getAnnotation(Info.class);
			Info info = (Info) annotation;
			System.out.println(info.createBy());
		}
	}
}

```


[Voltar ao Índice](#indice)

---
## <a name="parte10">Java IO - File</a>

```java
package com.schoolofnet.javaNative;

import java.io.File;
import java.io.IOException;
public class App {
	public static void main(String[] args) {
		try {
			File arquvio = new File("teste.txt");
			if(arquvio.createNewFile()) {
				System.out.println("Arquivo Criado");
			}else {
				System.out.println("Arquivo já existe!");
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

```

[Voltar ao Índice](#indice)

---
## <a name="parte11">Java IO - FileOuputStream</a>

```java
package com.schoolofnet.javaNative;

import java.io.File;
import java.io.FileOutputStream;

public class App {
	public static void main(String[] args) {

		File file;
		FileOutputStream fop = null;
		try {
			file = new File("Teste.txt");
			if(file.createNewFile()) {
				System.out.println("Arquivo Criado");
			}else {
				System.out.println("Arquivo já existe");
			}
			fop = new FileOutputStream(file);
			if(!file.exists()) {
				file.createNewFile();
			}
			String text = "Olá, Meu nome é José Stélio Malcher Jr. ";
			byte[] textBytes = text.getBytes();
			fop.write(textBytes);
			fop.flush();
			fop.close();
					
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}


```

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
