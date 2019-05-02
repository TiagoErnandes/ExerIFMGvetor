package ExerciciosRepeticaoLoianeYouTube;

import java.util.Scanner;

public class exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a quantidade de notas");
		double qtdN=scan.nextDouble();
		double soma =0;
		double media=0;
		
		for (int i=1;i<=qtdN;i++) {
			System.out.println("Digite a nota "+i);
		    Double nota = scan.nextDouble();
		    soma+=nota;
		    media= soma/i;
		}
  System.out.println("A media das notas :"+media+" é o total de pontos"+soma);
	}

}
