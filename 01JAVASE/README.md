# JAVA SE

[JAVA SE](https://www.schoolofnet.com/curso-java-se/)

---

## <a name="indice">índice</a>

- [Introdução](#parte1)
- [Nosso ambiente](#parte2)
- [História e principais conceitos](#parte3)
- [Executando programas Java]($parte4)
- [O que são packages](#parte5)
- [O que são classes](#parte6)
- [Principais classes](#parte07)
- [Tipos primitivos](#parte08)
- [Operadores](#parte09)
- [Condicões if else switch](#parte10)
- [Lendo dados dos Usuário](#parte11)
- [Debug](#parte12)
- [Array List](#parte13)
- [op for while do while](#parte14)
- [Introdução ao Java swing](#parte15)
- [Finalizando](#parte16)

---

## <a name="parte1">Introdução</a>

O Java SE é uma ferramenta completa, incluindo: APIs, compilador e máquina virtual. Neste curso você aprenderá o básico sobre Java SE, considerada uma das plataformas mais conhecidas no mundo e a grande porta de entrada para muitos programadores.


[Voltar ao Índice](#indice)

---
## <a name="parte2">Nosso ambiente</a>

Java Development Kit (JDK) significa Kit de Desenvolvimento Java, e é um conjunto de utilitários que permitem criar sistemas de software para a plataforma Java. É composto por compilador e bibliotecas

Link pra download: http://www.oracle.com/technetwork/pt/java/javase/downloads/index.html



[Voltar ao Índice](#indice)

---
## <a name="parte3">História e principais conceitos</a>

Java é uma linguagem de programação interpretada orientada a objetos desenvolvida na década de 90 por uma equipe de programadores chefiada por James Gosling, na empresa Sun Microsystems. Diferente das linguagens de programação convencionais, que são compiladas para código nativo, a linguagem Java é compilada para um bytecode que é interpretado por uma máquina virtual (Java Virtual Machine, mais conhecida pela sua abreviação JVM). A linguagem de programação Java é a linguagem convencional da Plataforma Java, mas não é a sua única linguagem.

FONTE Mais DETALHES: https://pt.wikipedia.org/wiki/Java_(linguagem_de_programa%C3%A7%C3%A3o)

Característias:

#### O compilador Java

Quando você programa na plataforma Java, escreve seu código-fonte em arquivos .java e depois os compila. O compilador verifica seu código nas regras de sintaxe da linguagem e depois grava bytecode em arquivos .class. Bytecode é um conjunto de instruções destinadas a executar em uma Java virtual machine (JVM). Ao incluir esse nível de abstração, o compilador Java difere-se de outros compiladores de linguagem, que escrevem instruções adequadas para o chipset de CPU no qual o programa é executado.

#### A JVM

No tempo de execução, a JVM lê e interpreta arquivos .class e executa as instruções do programa na plataforma de hardware nativa para qual a JVM foi escrita. A JVM interpreta o bytecode como uma CPU interpretaria instruções de linguagem assembly. A diferença é que a JVM é uma parte do software escrita especificamente para uma determinada plataforma. A JVM é o núcleo do princípio "gravação única, execução em qualquer local" da linguagem Java. Seu código pode executar em qualquer chipset para o qual a implementação da JVM adequada está disponível. JVMs estão disponíveis para principais plataformas, como Linux e Windows, e subconjuntos de linguagem Java foram implementados nas JVMs para telefones celulares e chips hobbyist.

#### O coletor de lixo

Em vez de forçá-lo a manter a alocação de memória (ou usar uma biblioteca de terceiros para isso), a plataforma Java fornece gerenciamento de memória fora do padrão. Quando seu aplicativo Java cria uma instância de objeto no tempo de execução, a JVM aloca automaticamente espaço de memória para esse objeto a partir de um conjunto de memória heap— reservado para uso de seu programa. O coletor de lixo Java é executado em segundo plano, mantendo o controle de quais objetos o aplicativo não necessita mais e recuperando memória deles. Essa abordagem para manipulação de memória é chamada de gerenciamento implícito de memória porque não exige a gravação de qualquer código de manipulação de memória. A coleta de lixo é um dos recursos essenciais para o desempenho da plataforma Java.

#### O Java Development Kit

Ao fazer o download de um Java Development Kit (JDK), você obtém, — além do compilador e de outras ferramentas, — uma biblioteca de classe completa de utilitários de pré-construção que o ajuda a realizar tarefas de desenvolvimento de aplicativo mais comuns. A melhor forma de obter uma ideia do escopo dos pacotes e bibliotecas JDK é verificar a documentação da API JDK.

Documentação da API: http://docs.oracle.com/javase/8/docs/api/

#### O Java Runtime Environment

O Java Runtime Environment (JRE; também conhecido como o tempo de execução Java) inclui a JVM, bibliotecas de códigos e componentes necessários para executar programas que são escritos na linguagem Java. O JRE está disponível para diversas plataformas.É possível redistribuir livremente o JRE com seus aplicativos, de acordo com os termos da licença do JRE, para fornecer aos usuários do aplicativo uma plataforma na qual executar seu software. O JRE está incluído no JDK.

#### Ambiente de desenvolvimento
O JDK inclui um conjunto de ferramentas de linha de comandos para compilar e executar seu código Java, incluindo uma cópia completa do JRE. Embora seja possível usar essas ferramentas para desenvolver seus aplicativos, a maioria dos desenvolvedores apreciam a funcionalidade adicional, o gerenciamento de tarefas e a interface visual de um IDE.

FONTE: https://www.ibm.com/developerworks/br/java/tutorials/j-introtojava1/index.html


[Voltar ao Índice](#indice)

---
## <a name="parte4">Executando programas Java</a>

```java
package com.cursoschoolofnet;

public class HelloWorld {
    //public static void main(String... args) {
    public static void main(String[] args) {
        System.out.println("Olá Mundo - Pela School of Net!!");
    }
}

```

[Voltar ao Índice](#indice)

---
## <a name="parte5">O que são packages</a>

#### pacotes
Usamos pacotes para organizar as classes semelhantes. Pacotes, a grosso modo, são apenas pastas ou diretórios do sistema operacional onde ficam armazenados os arquivos fonte de Java e são essenciais para o conceito de encapsulamento, no qual são dados níveis de acesso as classes.

Java posssui um pacote padrão que é utilizado quando programamos, mesmo embora não seja recomendado pela Sun usá-lo.

FONTE: http://www.tiexpert.net/programacao/java/pacotes.php

Mais detalhes: https://www.caelum.com.br/apostila-java-orientacao-objetos/pacotes-organizando-suas-classes-e-bibliotecas/



[Voltar ao Índice](#indice)

---
## <a name="parte6">O que são classes</a>

As classes de programação são receitas de um objeto, aonde têm características e comportamentos, permitindo assim armazenar propriedades e métodos dentro dela. Para construir uma classe é preciso utilizar o pilar da abstração. Uma classe geralmente representa um substantivo, por exemplo: uma pessoa, um lugar, algo que seja “abstrato”.

Uma classe é um tipo definido pelo usuário que contém a “receita”, a especificação para os objetos, algo mais ou menos como o tipo inteiro contém o molde para as variáveis declaradas como inteiros. A classe envolve, associa, funções e dados, controlando o acesso a estes, defini-la implica em especificar os seus atributos (dados) e seus métodos (funções).

Um programa que utiliza uma interface controladora de um motor elétrico provavelmente definiria a classe motor. Os atributos desta classe seriam: temperatura, velocidade, tensão aplicada. Estes provavelmente seriam representados na classe por tipos como int ou float. Os métodos desta classe seriam funções para alterar a velocidade, ler a temperatura, etc.

* Toda classe possui um nome;
* Possuem visibilidade, exemplo: public, private, protected;
* Possuem membros como: Características e Ações;
* Para criar uma classe basta declarar a visibilidade + digitar a palavra reservada class + NomeDaClasse + abrir e fechar chaves { }.
  

```java
package com.cursoschoolofnet;

public class Person {
    public String colorHair;
    public String eyeColor;
    public Float height;

    public Person(String black, float v, String blue){
        System.out.println("Executando COntrutor!");
    }

    public Person(String colorHair, String eyeColor, Float height) {
        this.colorHair = colorHair;
        this.eyeColor = eyeColor;
        this.height = height;
    }

    public void walk(){
        System.out.println("Eu estou andando....");
    }
}

```

```java
package com.cursoschoolofnet.main;

import com.cursoschoolofnet.Person;

public class PersonTest {
    public static void main(String[] args) {

        System.out.println("Olá, bem vindo!");

        Person aluno = new Person("Black", (float)1.70, "blue");
        aluno.walk();

    }
}

```

Leitura da apostila Caelum: https://www.caelum.com.br/apostila-java-orientacao-objetos/orientacao-a-objetos-basica/


[Voltar ao Índice](#indice)

---
## <a name="parte07">Principais classes</a>

[Wrappers em Java: Aprenda como utilizar](http://www.devmedia.com.br/wrappers-em-java-aprenda-como-utilizar/30275)

[diferença entre primitivo e wrapper classes?](http://www.guj.com.br/t/diferenca-entre-primitivo-e-wrapper-classes/211354)

[Voltar ao Índice](#indice)

---
## <a name="parte08">Tipos primitivos</a>

[3.2 - Tipos primitivos e valores](https://www.caelum.com.br/apostila-java-orientacao-objetos/variaveis-primitivas-e-controle-de-fluxo/#3-2-tipos-primitivos-e-valores)



[Voltar ao Índice](#indice)

---
## <a name="parte09">Operadores</a>

[Operadores lógicos e matemáticos da linguagem Java](http://www.devmedia.com.br/operadores-logicos-e-matematicos-da-linguagem-java/25248)

```java
public class AvaliaPrecedencia {

	public static void main(String[] args) {
		int a = 30;
		int b = 5;
		int c = 10;
		int total = (a + b + c) / 10;		
		System.out.println("O resultado = "+total);
	}
}
```

[Voltar ao Índice](#indice)

---
## <a name="parte10">Condicões if else switch</a>

https://www.caelum.com.br/apostila-java-orientacao-objetos/variaveis-primitivas-e-controle-de-fluxo/#3-6-o-if-e-o-else

```java
public class IfSwitch {
    public static void main(String[] args) {
        int a = 11;

		if (a > 10) {
			System.out.println("Is greater than 10");
		} else {
			System.out.println("Is not greater than 10");
		}

		int weekDay = 2;

		switch(weekDay) {
			case 1:
				System.out.print("Sunday");
				break;
			case 2:
				System.out.print("Monday");
				break;
			case 3:
				System.out.print("Tuesday");
				break;
			case 4:
				System.out.print("Wednesday");
				break;
			case 5:
				System.out.print("Thurday");
				break;
			case 6:
				System.out.print("Friday");
				break;
			case 7:
				System.out.print("Saturday");
				break;
			default:
				System.out.print("This option does not exists");

		}
    }
}

```

[Voltar ao Índice](#indice)

---
## <a name="parte11">Lendo dados dos Usuário</a>

```java
import java.util.Scanner;

public class LendoDadosUsuario {
    public static void main(String[] args) {
        Scanner leitor  = new Scanner(System.in);

        System.out.println("QUal seu nome?");
        String nome = leitor.nextLine();

        System.out.println("Meu nome é "+ nome);
    }
}
```
```java
import java.util.Scanner;

public class Calculadora {
    public static Double soma(Double num1, Double num2) {
        return num1 + num2;
    }

    public static Double subtracao(Double num1, Double num2) {
        return num1 - num2;
    }

    public static Double multi(Double num1, Double num2) {
        return num1 + num2;
    }

    public static Double div(Double num1, Double num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println(" Digite o primeiro valor");
        Double valor1 = leitor.nextDouble();
        System.out.println(" Digite o Segundo valor");
        Double valor2 = leitor.nextDouble();

        System.out.println("OPERAÇÕES: 1-> + , 2-> - , 3-> * , 4-> / ");
        String operador = leitor.next();

        Double resultado = 0.0;

        if(operador.equals("1")){
            resultado = soma(valor1,valor2);
        }
        if(operador.equals("2")){
            resultado = subtracao(valor1 , valor2);
        }
        if(operador.equals("3")){
            resultado = multi(valor1 , valor2);
        }
        if(operador.equals("4")){
            resultado = div(valor1 , valor2);
        }

        System.out.println("Resultado = " + resultado);

    }
}

```

[Voltar ao Índice](#indice)

---
## <a name="parte12">Debug</a>


[Voltar ao Índice](#indice)

---
## <a name="parte13">Array List</a>


[Voltar ao Índice](#indice)

---
## <a name="parte14">op for while do while</a>


[Voltar ao Índice](#indice)

---
## <a name="parte15">Introdução ao Java swing</a>


[Voltar ao Índice](#indice)

---
## <a name="parte16">Finalizando</a>


[Voltar ao Índice](#indice)

---