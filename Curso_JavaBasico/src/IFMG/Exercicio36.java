package IFMG;

import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totIngresso = 120;
		double ingresso = 5, acrescimo = 0.50;
		double lucro = 0, maiorLuvro = 0;
		String resultado = "";

		while (ingresso > 1) {
			ingresso -= 0.50;
			totIngresso += 26;	
			lucro = totIngresso * ingresso;
			if (lucro > maiorLuvro) {
				maiorLuvro = lucro;
				resultado = "O maior lucro é R$" + lucro + " o total de \ningressos" + " vendidos :" + totIngresso
						+ " no valor de R$ " + ingresso;
			}
		}
		System.out.println(resultado);	
	}	
}
