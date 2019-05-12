package CursoJavaLoiane;

import java.util.Scanner;

public class testeLivro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Livro livro = new Livro();
		
		livro.setAutor("Loiane Java");
		livro.setAssunto("Java Basico");
		livro.setNome("Poder do Java");
		livro.setTotPaginas(260);
		System.out.println(livro.toString());
		
	}

}
