import java.util.Scanner;

public class testeJava {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			// QUESTÃO 02
			
			int var, numero;
			var = 19;
			for (int i = 0; i < var; i++ ) {
			Scanner dado = new Scanner (System.in);
			System.out.println("Informe um número: ");
			numero = dado.nextInt();
			if (numero == 0) {
				continue;
			}
				else if (numero == -1) { 
					break;
				}
			if (numero % 2 == 0) {
				System.out.println("Número Par");
			}
				else {
					System.out.println("número Ímpar");
			} 
		}
		}
	

	}

