import java.util.Scanner;

public class LendoDadosUsuario {
    public static void main(String[] args) {
        Scanner leitor  = new Scanner(System.in);

        System.out.println("QUal seu nome?");
        String nome = leitor.nextLine();

        System.out.println("Meu nome é "+ nome);
    }
}
