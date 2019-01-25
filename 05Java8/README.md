# JAVA 8

O Java continua evoluindo, trazendo com sí novas propostas e introduzindo também paradigmas diferentes. Neste curso estaremos mostrando como o Java 8 chegou e quais as principais mudanças que houveram, introdução de programação funcional, melhoras em API e muito mais.

https://www.schoolofnet.com/curso/java/linguagem-java/java-8/

---

## <a name="indice">Índice</a>

- [Introdução](#parte1)   
- [Preparando ambiente](#parte2)   
- [O que mudou?](#parte3)   
- [Programação funcional](#parte4)   
- [Criando nosso projeto](#parte5)   
- [Lambdas](#parte6)   
- [Method references](#parte7)   
- [Functional annotations](#parte8)   
- [Streams](#parte9)   
- [Optional](#parte10)   
- [Data-Time_API](#parte11)   
- [Nashorn Javascript engine](#parte12)   
- [Finalizando](#parte13)   


---

## <a name="parte1">Introdução</a>



[Voltar ao Índice](#indice)

---

## <a name="parte2">Preparando ambiente</a>

- JDK

[Voltar ao Índice](#indice)

---

## <a name="parte3">O que mudou?</a>



[Voltar ao Índice](#indice)

---

## <a name="parte4">Programação funcional</a>


- https://pt.wikipedia.org/wiki/Programa%C3%A7%C3%A3o_funcional
- https://medium.com/trainingcenter/programa%C3%A7%C3%A3o-funcional-para-iniciantes-9e2beddb5b43


[Voltar ao Índice](#indice)

---

## <a name="parte5">Criando nosso projeto</a>

```java

public class Main {
    public static void main(String... args) {

        System.out.println("Hello school of net - java 8");

    }
}

```

[Voltar ao Índice](#indice)

---

## <a name="parte6">Lambdas</a>

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String... args) {
        /*
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello school of net - java 8");
            }
        };
        new Thread(run).start();

        Runnable run1 = () -> System.out.println("JAVA 8 - Lambda");
        new Thread(run1).start();

        new Thread(()-> System.out.println("JAVA 8 lambda")).start();
        */

        // Outro exemplo

        List<String> strs = Arrays.asList("Jose","Maria", "JAVA", "JAVA 8");
        for(String str: strs){
            System.out.println(str);
        }

        System.out.println( "Com lambda: ");
        strs.forEach(str-> System.out.println(str));

        System.out.println("Filtro com M");
        List<String> result = strs.stream()
                                .filter(str->str.startsWith("M"))
                                .collect(Collectors.toList());
        result.forEach(System.out::println);

    }
}

```

[Voltar ao Índice](#indice)

---

## <a name="parte7">Method references</a>


[Voltar ao Índice](#indice)

---

## <a name="parte8"></a>



[Voltar ao Índice](#indice)

---

## <a name="parte9"></a>



[Voltar ao Índice](#indice)

---

## <a name="parte10"></a>



[Voltar ao Índice](#indice)

---

## <a name="parte11"></a>



[Voltar ao Índice](#indice)

---

## <a name="parte12"></a>



[Voltar ao Índice](#indice)

---

## <a name="parte13"></a>



[Voltar ao Índice](#indice)

---

## <a name="parte14"></a>



[Voltar ao Índice](#indice)

---

## <a name="parte15"></a>



[Voltar ao Índice](#indice)

---

## <a name="parte16"></a>



[Voltar ao Índice](#indice)

