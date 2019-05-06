package IFMG;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int num ;
		System.out.println("Digite um numero ");
		num = scan.nextInt();
		
		for (int i=1;i<=num;i++) {
			System.out.println();
			System.out.println("Tabuada do "+i+".\n ");
			for(int j =1;j<=10;j++) {
				System.out.println(i+" x "+j+" = "+(i*j));
			}
		
		}
	}

}
