# Orientação a Objetos com Java

[JAVA SE](https://www.schoolofnet.com/curso-orientacao-objetos-com-java/)

---

## <a name="indice">índice</a>

- [Introdução](#parte1)
- [Nosso ambiente](#parte2)
- [OOP](#parte3)    
- [Criando seu projeto](#parte4)
- [Classes](#parte5)    
- [Totalmente OO?](#parte6)    
- [Atributos](#parte7)    
- [Métodos](#parte8)    
- [Métodos estáticos](#parte9)    
- [Construtores](#parte10)    
- [Encapsulamento](#parte11)    
- [Herança](#parte12)    
- [Composições](#parte13)    
- [Polimorfismo](#parte14)    
- [Interfaces](#parte15)    
- [Classes abstratas](#parte16)        
- [Finalizando](#parte17)          


---

## <a name="parte1">Introdução</a>

Orientação a objetos é uma maneira de programar que ajuda na organização e resolve muitos problemas enfrentados pela programação procedural.

https://www.caelum.com.br/apostila-java-orientacao-objetos/orientacao-a-objetos-basica/

[Voltar ao Índice](#indice)

---
## <a name="parte2">Nosso ambiente</a>

Java Development Kit (JDK) significa Kit de Desenvolvimento Java, e é um conjunto de utilitários que permitem criar sistemas de software para a plataforma Java. É composto por compilador e bibliotecas

Link pra download: http://www.oracle.com/technetwork/pt/java/javase/downloads/index.html

[Voltar ao Índice](#indice)

---
## <a name="parte3">OOP</a>

Orientação a objetos vai te ajudar em muito em se organizar e escrever menos, além de concentrar as responsabilidades nos pontos certos, flexibilizando sua aplicação, encapsulando a lógica de negócios.

Outra enorme vantagem, onde você realmente vai economizar montanhas de código, é o polimorfismo das referências, que veremos em um posterior capítulo.

https://www.caelum.com.br/apostila-java-orientacao-objetos/orientacao-a-objetos-basica/#4-1-motivacao-problemas-do-paradigma-procedural



[Voltar ao Índice](#indice)

---
## <a name="parte4">Criando seu projeto</a>

[Dicas e truques de IntelliJ IDEA para quem está começando](http://blog.alura.com.br/dicas-e-truques-de-intellij-idea-para-quem-esta-comecando/)



[Voltar ao Índice](#indice)

---
## <a name="parte5">Classes</a>

https://www.caelum.com.br/apostila-java-orientacao-objetos/orientacao-a-objetos-basica/#4-3-uma-classe-em-java


[Voltar ao Índice](#indice)

---
## <a name="parte6">Totalmente OO?</a>

Fórun: http://www.guj.com.br/t/java-e-totalmente-orientado-a-objetos/54223/10



[Voltar ao Índice](#indice)

---
## <a name="parte7">Atributos</a>

https://www.caelum.com.br/apostila-java-orientacao-objetos/orientacao-a-objetos-basica/#4-9-continuando-com-atributos


```java
public class Pessoa {
    public String nome;
    public Integer idade;
    public String endereco;
}

```

```java
public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();
        pessoa01.nome = "JOSE";
        pessoa01.idade = 33;

        System.out.println("NOME: "+ pessoa01.nome);
    }
}

```

[Voltar ao Índice](#indice)

---
## <a name="parte8">Métodos</a>

https://www.caelum.com.br/apostila-java-orientacao-objetos/orientacao-a-objetos-basica/#4-5-metodos

```java

public class Metodos {
    public String frase = "Dentro de um método";

    public void metodoFrase(){
        System.out.println(this.frase);
    }

}

```
```java
public class MetodosTeste {
    public static void main(String[] args) {
        Metodos metodo01 = new Metodos();
        metodo01.metodoFrase();
    }
}

```

[Voltar ao Índice](#indice)

---
## <a name="parte9">Métodos estáticos</a>

https://www.caelum.com.br/apostila-java-orientacao-objetos/modificadores-de-acesso-e-atributos-de-classe/#6-6-atributos-de-classe

```java
public class MetodoEstatico {

    private static Integer valorFixo = 10;
    private Integer valorVariavel;

    public static Integer getValorFixo() {
        return valorFixo;
    }

    public static void setValorFixo(Integer valorFixo) {
        MetodoEstatico.valorFixo = valorFixo; // <<<<<---------------
    }

    public Integer getValorVariavel() {
        return valorVariavel;
    }

    public void setValorVariavel(Integer valorVariavel) {
        this.valorVariavel = valorVariavel; // <<<<<---------------
    }

    //método statico

    public void imprimeValores(){
        System.out.println("Valor Fixo = " + valorFixo);
        System.out.println("Valor Variável = "+ valorVariavel);
    }
    public static void imprimeMetodoEstatico(){
        System.out.println("Dentro do método statico");
        System.out.println("Valor Fixo = " + valorFixo);
        //System.out.println("Valor Variável = "+ valorVariavel); // não compila
    }
}

```
```java
public class MetodoEstaticoTeste {
    public static void main(String[] args) {

        MetodoEstatico metodo01 = new MetodoEstatico();
        metodo01.setValorVariavel(55);
        metodo01.imprimeValores();
        
        System.out.println("---------------");
        MetodoEstatico.setValorFixo(222); // alterando valor fixo
        System.out.println(MetodoEstatico.getValorFixo());
        MetodoEstatico.imprimeMetodoEstatico();

        System.out.println("---------------");
        metodo01.imprimeValores(); // <<<<------

    }
}

```

[Voltar ao Índice](#indice)

---
## <a name="parte10">Construtores</a>

https://www.caelum.com.br/apostila-java-orientacao-objetos/modificadores-de-acesso-e-atributos-de-classe/#6-4-construtores

```java
public class Construtores {
    private int numero;
    private double saldo;
    private double limite;

    public Construtores(int numero, double saldo, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    public Construtores() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public void imprime(){
        System.out.println("NUMERO: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
    }
}

```

```java
public class ConstrutoresTeste {
    public static void main(String[] args) {

        Construtores c01 = new Construtores();

        Construtores c02 = new Construtores(123,100.88,123.456);

        c01.imprime();
        c02.imprime();

       /*
        NUMERO: 0
        Saldo: 0.0
        Limite: 0.0
        NUMERO: 123
        Saldo: 100.88
        Limite: 123.456
       */

    }
}

```

[Voltar ao Índice](#indice)

---
## <a name="parte11">Encapsulamento</a>

https://www.caelum.com.br/apostila-java-orientacao-objetos/modificadores-de-acesso-e-atributos-de-classe/#6-2-encapsulamento

```java
public class Encapsulamento {

    private String nome;
    private String endereco;
    private String cpf;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void mudaCPF(String cpf) {
        if (this.idade <= 60) {
            validaCPF(cpf);
        }
        this.cpf = cpf;
    }

    private void validaCPF(String cpf) {
        // série de regras aqui, falha caso não seja válido
    }
    /*
    O controle sobre o CPF está centralizado: ninguém consegue acessá-lo sem passar por aí,
    a classe "Cliente"(por exemplo) é a única responsável pelos seus próprios atributos!
     */

}

```
```java
public class EncapsulamentoTeste {
    public static void main(String[] args) {
        Encapsulamento cliente01 = new Encapsulamento();

        cliente01.setNome("JOSE ");
        //cliente01.nome;
        ...
    }
}

```

[Voltar ao Índice](#indice)

---
## <a name="parte12">Herança</a>

https://www.caelum.com.br/apostila-java-orientacao-objetos/heranca-reescrita-e-polimorfismo/

```java
public class HerancaVeiculo {
    private String cor;
    private Double velocidadeMaxima;

    public HerancaVeiculo(String cor, Double velocidadeMaxima) {
        this.cor = cor;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public HerancaVeiculo() {
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}

```
```java
public class HerancaVeiculoCarro extends HerancaVeiculo{
    private Integer machas;

    public HerancaVeiculoCarro(String cor, Double velocidadeMaxima, Integer machas) {
        super(cor, velocidadeMaxima);
        this.machas = machas;
    }

    public HerancaVeiculoCarro() {
        super();
    }

    public HerancaVeiculoCarro(Integer machas) {
        this.machas = machas;
    }

    public Integer getMachas() {
        return machas;
    }

    public void setMachas(Integer machas) {
        this.machas = machas;
    }
}

```
```java
public class HerancaTeste {
    public static void main(String[] args) {
        HerancaVeiculoCarro carro01 = new HerancaVeiculoCarro();

        carro01.setCor("Preta");
        carro01.setMachas(6);
        carro01.setVelocidadeMaxima(300.0);

    }
}

```

[Voltar ao Índice](#indice)

---
## <a name="parte13">Composições</a>

https://www.caelum.com.br/apostila-java-orientacao-objetos/heranca-reescrita-e-polimorfismo/#7-6-um-pouco-mais

```java
public class ComposicaoCarro {

    private HerancaVeiculo veiculo01= new HerancaVeiculo();

    public ComposicaoCarro(HerancaVeiculo veiculo01) {
        this.veiculo01 = veiculo01;
    }

    public ComposicaoCarro() {
    }

    public HerancaVeiculo getVeiculo01() {
        return veiculo01;
    }

    public void setVeiculo01(HerancaVeiculo veiculo01) {
        this.veiculo01 = veiculo01;
    }
}

```

```java
public class ComposicaoCarroTeste {
    public static void main(String[] args) {

        ComposicaoCarro carroModelo = new ComposicaoCarro();
        carroModelo.getVeiculo01().setCor("AZUL");
        carroModelo.getVeiculo01().setVelocidadeMaxima(300.00);

        System.out.println("COR " + carroModelo.getVeiculo01().getCor());
        System.out.println("Velocidade Máxima " + carroModelo.getVeiculo01().getVelocidadeMaxima());

    }
}

```

[Voltar ao Índice](#indice)

---
## <a name="parte14">Polimorfismo</a>

https://www.caelum.com.br/apostila-java-orientacao-objetos/heranca-reescrita-e-polimorfismo/#7-4-polimorfismo

```java
public class PoliPessoa {
    private String nome;
    private Integer idade;
    private String veiculo;

    public PoliPessoa(String nome, Integer idade, String veiculo) {
        this.nome = nome;
        this.idade = idade;
        this.veiculo = veiculo;
    }

    public PoliPessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public PoliPessoa() {
    }

    public String getNome() {
        return this.nome;
    }

    public String getNome(String apelido) { //  <<<<-------------------
        return "Nome é " + this.nome + " Apelido " + apelido;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public void metodoSobreescrito(){
        System.out.println("TESTE Método sobreescrito - PAI");
    }


}

```
```java
public class PoliPessoaCrianca extends PoliPessoa {

    public PoliPessoaCrianca(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public void metodoSobreescrito() {
        //super.metodoSobreescrito();
        System.out.println("Método dentro do FILHO");
    }
}

```
```java
public class PoliPessoaTeste {
    public static void main(String[] args) {

        PoliPessoa pessoa = new PoliPessoa("Jose Malcher", 33, "Moto");

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getNome("Avenida "));
        pessoa.metodoSobreescrito();
        System.out.println("-----------------------------------------------------------------");

        PoliPessoaCrianca crianca = new PoliPessoaCrianca("Maria", 05);
        System.out.println(crianca.getNome());
        System.out.println(crianca.getNome("Mariazinha"));
        crianca.metodoSobreescrito();


    }

}

```

[Voltar ao Índice](#indice)

---
## <a name="parte15">Interfaces</a>

https://www.caelum.com.br/apostila-java-orientacao-objetos/interfaces/

```java
public interface IPessoa {
    public void metodoInterface01();
    void metodoInterface02();
}

```
```java
public class InterfPessoa implements IPessoa {
    @Override
    public void metodoInterface01() {

    }

    @Override
    public void metodoInterface02() {

    }
}

```

[Voltar ao Índice](#indice)

---
## <a name="parte16">Classes Abstratas</a>

https://www.caelum.com.br/apostila-java-orientacao-objetos/classes-abstratas/

```java
public abstract class AbstAnimal {
    public abstract void abstRosnar();
}

```
```java
public class AbstCachorro extends AbstAnimal {
    @Override
    public void abstRosnar() {
        System.out.println("Latir!!");
    }
}

```

[Voltar ao Índice](#indice)

---
## <a name="parte17">Finalizando</a>



[Voltar ao Índice](#indice)

---