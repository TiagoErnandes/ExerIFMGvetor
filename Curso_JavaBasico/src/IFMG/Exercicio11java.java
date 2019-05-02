package IFMG;

import java.util.Scanner;

public class Exercicio11java {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int num;
		double soma=0;
		System.out.println("Digite o valor de N");
		num = scan.nextInt();
		
		for (int i =1;i <=num;i++ ) {
			if(i%2==1) {
			soma +=(double) 1/i;
			}else {
			System.out.println(soma);
			soma -=(double) 1/i;
			}
			System.out.println(soma);
			
		}
		
	}

}
