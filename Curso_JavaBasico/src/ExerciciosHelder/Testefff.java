package ExerciciosHelder;

import java.util.Scanner;

public class Testefff {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double numero = 1, valorPar = 0, valorImpar = 0, numeroMaiorPar = Integer.MAX_VALUE,
				numeroMenorImpar = Integer.MIN_VALUE, mediaPar, contadorPar = 0, contadorImpar = 0, mediaImpar;
		while (numero > 0) {
			System.out.println("Insira valores de números: ");
			numero = teclado.nextDouble();
			if (numero % 2 == 0) {
				valorPar += numero;
				contadorPar++;
				if (numero < numeroMaiorPar) {
					numeroMaiorPar = numero;
				} else {
					valorImpar += numero;
					contadorImpar++;
					if (numero > numeroMenorImpar) {
						numeroMenorImpar = numero;
					}
					
				}
			}
		}mediaPar = valorPar / contadorPar;
		mediaImpar = valorImpar / contadorImpar;
		System.out.println("Maior número par: " + numeroMaiorPar + "\n Média par: " + mediaPar
				+ "\n Menor número ímpar: " + numeroMenorImpar + "\n Média ímpar:" + mediaImpar);
	}
}