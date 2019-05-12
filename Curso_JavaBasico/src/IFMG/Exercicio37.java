package IFMG;

import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int codigo, marcos = 0, pedro = 0, rafael = 0, lucas = 0, nulo = 0, branco = 0;
		boolean validador = false;

		while (!validador) {
			System.out.println("     !!! Digite seu voto !!!");
			System.out.println(" 1-Marcos 2-Pedro  3-Rafael  4 -Lucas");
			codigo = scan.nextInt();
			if (codigo == 0) {
				validador = true;
			} else {
				switch (codigo) {
				case 1:
					marcos++;
					break;
				case 2:
					pedro++;
					break;
				case 3:
					rafael++;
					break;
				case 4:
					lucas++;
					break;
				case 5:
					branco++;
					break;
				default:
					nulo++;
					break;
				}
			}
		}
		System.out.println("___Resultado da eleição___");
		System.out.println("Marcos :"+marcos+" votos\n"+"Pedro :"+pedro+" votos\n"+"Rafael :"+rafael+" votos\n"+"Lucas :"
				+ ""+lucas+" votos\n"+"Nulos :"+nulo+" votos\n"+"Branco :"+branco+" votos\n");
	}
}
