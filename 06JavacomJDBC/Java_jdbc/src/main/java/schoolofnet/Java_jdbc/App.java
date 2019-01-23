package schoolofnet.Java_jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);

		MovieDao dao = new MovieDao();

		System.out.println("-----------------MENU-------------------");
		System.out.println("1 - Listar filmes");
		System.out.println("2 - Criar novo filme");
		System.out.println("3 - Atualizar um filme");
		System.out.println("4 - Deletar um filme");
		System.out.println("----------------------------------------");

		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			ArrayList<Movie> data = (ArrayList<Movie>) dao.findAll();
			for (Movie movie : data) {
				System.out.println("ID: " + movie.getId());
				System.out.println("Nome: " + movie.getNome());
			}
			break;
		case 2:
			System.out.println("Entrar com o nome do filme");
			scanner.nextLine();
			String nome = scanner.nextLine();
			System.out.println(nome);
			dao.insert(new Movie(nome));
			break;
		case 3:
			System.out.println("Entre com o ID Para Atualizar");
			Integer id = scanner.nextInt();

			Movie movieExiste = dao.findById(id);
			if (movieExiste != null) {
				System.out.println("Entre com o novo nome: ");
				scanner.nextLine();
				String novoNome = scanner.nextLine();

				Movie novoMovie = new Movie(movieExiste.getId(), novoNome);
				dao.update(movieExiste, novoMovie);
			} else {
				System.out.println("ID NÂO EXISTE");
			}
			break;
		case 4:
			System.out.println("Entre com ID para deletar");
			Integer idDelete = scanner.nextInt();

			Movie movieExistDeletar = dao.findById(idDelete);
			if (movieExistDeletar != null) {
				dao.remove(movieExistDeletar);
			} else {
				System.out.println("ID NÂO EXISTE");
			}
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		}
		scanner.close();
	}
}
