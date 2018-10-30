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



[Voltar ao Índice](#indice)

---

## <a name="parte5">Criando nosso projeto</a>



[Voltar ao Índice](#indice)

---

## <a name="parte6">Lambdas</a>

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String... args) {

        List<String> strs = Arrays.asList("Jose", "Malcher", "Email", "Java");

        /*for(String str : strs){
            System.out.println(str);
        }

        System.out.println("---------Lambdas----------");
        strs.forEach(str -> System.out.println(str));
        */
        List<String> result = strs.stream()
                .filter(str -> str.startsWith("E"))
                .collect(Collectors.toList());

        result.forEach(System.out::println);

    }
}


[Voltar ao Índice](#indice)

---

## <a name="parte7">Method references</a>

```java
public class Person {
    public static void say(String s){
        System.out.println("A new person is saying something..." + s);
    }
}

```

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String... args) {

        List<String> strs = Arrays.asList("Jose", "Malcher", "Email", "Java");

        /*for(String str : strs){
            System.out.println(str);
        }

        System.out.println("---------Lambdas----------");
        strs.forEach(str -> System.out.println(str));
        */
        List<String> result = strs.stream()
                .filter(str -> str.startsWith("E"))
                .collect(Collectors.toList());

        //result.forEach(System.out::println);
        result.forEach(Person::say);

    }
}

```

```
A new person is saying something...Email
```

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

