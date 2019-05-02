package CursoJavaLoiane;

import java.util.Scanner;

public class TesteRevisao {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double nota;
		boolean valido = true;
		
		while (valido) {
			System.out.println("Digite o valor da nota de 0 a 10");{
				nota = scan.nextDouble();
				
				if (nota < 0 || nota > 10) {
					System.out.println("Erro Valor invalido (Digite o valor de 0 a 10  ");
					
				}else {	
					System.out.println("Valor Valido ");
					valido=false;
				}			
			}
		}

	}

}
