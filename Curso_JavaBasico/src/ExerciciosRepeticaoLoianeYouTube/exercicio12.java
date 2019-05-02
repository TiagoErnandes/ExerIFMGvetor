package ExerciciosRepeticaoLoianeYouTube;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o numero da tabuada :");
		int tabu = scan.nextInt();
		for(int i =0;i<10;i++) {
			System.out.println(tabu+" x "+i+" = "+(i*tabu));
		}

	}

}
