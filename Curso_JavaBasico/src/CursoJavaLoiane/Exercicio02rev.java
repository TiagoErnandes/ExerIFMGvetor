package CursoJavaLoiane;

import java.util.Scanner;

public class Exercicio02rev {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String nome,senha;
		boolean valido =true;
		
		while (valido) {
			System.out.println("Digite o seu login ");
			nome= scan.nextLine();
			System.out.println("Digite a senha ");
			senha = scan.nextLine();
			if (nome.equalsIgnoreCase(senha)) {
				System.out.println("Senha invalida! Digite a senha diferente do login ");
			}else {
				System.out.println("Senha cadastrada com Sucesso!!!");
				valido = false;
			}
			
		}
	}

}
