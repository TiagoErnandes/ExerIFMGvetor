package IFMG;

import java.util.Scanner;

public class Exercicios30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int num;
		System.out.println("Digite o numero ");
		num = scan.nextInt();
		String teste = "x";
		for (int i =1;i<=num;i++) {
			System.out.println();
			System.out.print("x");
			for (int j =1;j<=num;j++) {
				
				System.out.print("x");
			}	
		}
	

	}

}
