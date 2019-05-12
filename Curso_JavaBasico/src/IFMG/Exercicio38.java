package IFMG;

import java.util.Scanner;

public class Exercicio38 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int num=0,aux=0;
		System.out.println("Digite o valor");
		num = scan.nextInt();
		
		for (int i =1;i<=num;i++) {
			if (num % i == 0) {
				aux+=i;
			}else {
				
			}
			if(aux == num) {
				System.out.println("Numero Perfeito");
				break;
			}
		}
		
	}

}
