package schoolofnet.Java_jdbc;

import java.sql.SQLException;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("-----------------MENU-------------------");
        System.out.println("1 - Listar filmes");
        System.out.println("2 - Criar novo filme");
        System.out.println("3 - Atualizar um filme");
        System.out.println("4 - Deletar um filme");
        System.out.println("----------------------------------------");

        int choice = scanner.nextInt();
        switch (choice) {
		case 1:
			System.out.println("Inserindo");
			break;

		default:
			System.out.println("Opção Inválida");
			break;
		}
    	 
    	
    }
}
