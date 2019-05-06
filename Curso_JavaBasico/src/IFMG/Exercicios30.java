package IFMG;

import java.util.Scanner;

public class Exercicios30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Digite o numero ");
		num = scan.nextInt();

		for (int i = 1; i < num; i++) {

			System.out.println();

			for (int j = i; j > 0; j--)
				System.out.print("#");
		}
<<<<<<< HEAD
=======
	}
	

>>>>>>> branch 'master' of https://github.com/TiagoErmamdes/aulas-Java.git
	}
}
