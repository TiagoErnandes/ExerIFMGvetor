package IFMG;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int verificador, verificadorHex, controle, num, potencia = 0, decimal = 0, soma = 0, cont = 0, aux = 0;
		String hexa = "";

		System.out.println("Digite o numero em binario");
		num = scan.nextInt();
		verificador = num;
		verificadorHex = num;
		
		
		while (verificador != 0) {
			controle = verificador % 10;
			verificador = verificador / 10;

			if (controle == 1) {
				decimal += Math.pow(2, potencia);

			}
			potencia++;
		}

		cont = 0;
		soma = 0;
		while (cont < 4) {
			aux = verificadorHex % 10;
			if (aux == 1) {
				if (cont == 0) {
					soma += 1;
				} else if (cont == 1) {
					soma += 2;
				} else if (cont == 2) {
					soma += 4;
				} else if (cont == 3) {
					soma += 8;
				}
			}
			verificadorHex = verificadorHex / 10;
			cont++;
		}

		if (soma < 10) {
			hexa += soma + "";
		} else {
			if (soma == 10) {
				hexa = "A" + hexa;
			} else if (soma == 11) {
				hexa = "B" + hexa;
			} else if (soma == 12) {
				hexa = "C" + hexa;
			} else if (soma == 13) {
				hexa = "D" + hexa;
			} else if (soma == 14) {
				hexa = "E" + hexa;
			} else if (soma == 15) {
				hexa = "F" + hexa;
			}
		}
		System.out.println(num);

		System.out.println(decimal);
		System.out.println(hexa);
	}

}
