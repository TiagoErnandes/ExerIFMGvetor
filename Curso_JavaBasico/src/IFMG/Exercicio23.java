package IFMG;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0, maiorPar = Integer.MIN_VALUE, menorPar = Integer.MAX_VALUE, maiorImpar = Integer.MIN_VALUE,
				menorImpar = Integer.MAX_VALUE, totPar = 0, totImpar = 0, somaPar = 0, somaImpar = 0;
		double mediaPar,mediaImpar;
		
		while (num >= 0) {
			System.out.println("Digite o numero");
			num = scan.nextInt();
			if (num % 2 == 0) {
				totPar++;
				somaPar += num;
				if (num > maiorPar) {
					maiorPar = num;
				}
			} else {
				totImpar++;
				somaImpar += num;
				if (num < menorImpar) {
					menorImpar = num;
				}
			}

		}
		 mediaPar= somaPar/totPar;
		 mediaImpar = somaImpar/totImpar;
		 System.out.println("A media de numeros digitados Pares é :"+mediaPar);
		 System.out.println("A media de numeros digitados Impares é "+mediaImpar);
		 System.out.println("O Maior numero Par Digitado foi "+maiorPar);
		 System.out.println("O menor numero Impar digitado foi "+menorImpar);
		 

	}

}
