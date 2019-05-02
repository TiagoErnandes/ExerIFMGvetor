package IFMG;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		double soma = 0, resultado = 0;
		num = 51;
		for (int i = 3; i <= num; i = i + 2) {
			if (i % 2 == 1) {
				System.out.println(i);
				soma += (double) (1 / Math.pow(i, 3));
				System.out.println(soma);
			} else {
				soma -= (double) 1 / (Math.pow(3, i));
				System.out.println(soma);
			}
			
			resultado = Math.cbrt((soma*32));
			System.out.println(resultado);

		}

	}
}