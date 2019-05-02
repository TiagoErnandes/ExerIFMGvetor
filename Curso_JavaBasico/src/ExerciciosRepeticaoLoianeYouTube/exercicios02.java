package ExerciciosRepeticaoLoianeYouTube;

import java.util.Scanner;

public class exercicios02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		boolean valida = false;
		
		do {
		System.out.println("Digite o nome do usuario");
		String usuario = scan.next();
		System.out.println("Digite a senha ");
		String senha = scan.next();
		    if (usuario.equalsIgnoreCase(senha)) {
		    	valida = true;
		    	System.out.println("Erro (senha igual ao login, tente novamente");
		    }else {
		    	System.out.println("Logado com sucesso");
		    }
		}while(valida);	
         System.out.println("Fim");
	}

}
