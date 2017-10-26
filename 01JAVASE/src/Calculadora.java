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
