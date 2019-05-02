package ExerciciosRepeticaoLoianeYouTube;

import java.util.Scanner;

public class exercicios24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o valor do pão :");
		double pao = scan.nextDouble();
		for (int i =1;i <=50;i++) {
			System.out.println(i +"-   R$ "+(i*pao));
		}

	}

}
