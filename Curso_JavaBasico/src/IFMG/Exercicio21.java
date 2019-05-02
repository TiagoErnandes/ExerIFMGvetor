package IFMG;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		double resultado = 0;
		int operaçao = 0;
		boolean valido = false;

		while (!valido) {
			System.out.println("Digite o numero 1");
			num1 = scan.nextInt();
			System.out.println("Digite o numero 2");
			num2 = scan.nextInt();

			System.out.println("====================\r\n" + "Calculadora de Fulano\r\n" + "====================\r\n"
					+ "Opções:\r\n" + "1 - Soma\r\n" + "2 - Subtração\r\n" + "3 - Multiplicação\r\n" + "4 - Divisão\r\n"
					+ "5 – Sair\r\n" + "==================== ");

			operaçao = scan.nextInt();
			resultado=0;
			if (num2 == 0 && operaçao == 4) {
				System.out.println("O denominado não pode ser 0");
			} else {

				switch (operaçao) {
				case 1:
					resultado =(double) num1 + num2;
					break;
				case 2:
					resultado =(double) num1 - num2;
					break;
				case 3:
					resultado =(double) num1 * num2;
					break;
				case 4:
					resultado =(double) num1 / num2;
					break;
				case 5:
					valido = true;
					break;
					
				default:
					break;
				}
			}System.out.println(resultado);
		}
		System.out.println("FIM");
		
	}

}
