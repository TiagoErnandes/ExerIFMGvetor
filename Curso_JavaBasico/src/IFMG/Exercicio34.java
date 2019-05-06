package IFMG;

import java.util.Scanner;

public class Exercicio34 {

	
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0, p = 0;
		System.out.println("Digite o valor de N");
		n = scan.nextInt();
		System.out.println("Digite o valor de P");
		p = scan.nextInt();
		
		int fatorialN =1;
		for (int i =n;i>0;i--) {
			fatorialN *=i;
		}
		
		int fatorialP =1;
		for (int i =p;i>0;i--) {
			fatorialP *=i;
		}
		
		int fatorialNP = 1;
		for (int i =(n-p);i>0;i--) {
			fatorialNP *=i;
		}
		
		//An_p = n!/(n-p)! Arranjo
		double resultadoArran = (double ) fatorialN /fatorialNP;
		//Cn_p = n!/ ( p! * (n - p)! )Combinação
		double resultadoCombi = (double ) fatorialN /(fatorialP*fatorialNP);
		System.out.println("O Arranjo é :"+resultadoArran);
		System.out.println("A combinação :"+resultadoCombi);
		
		
		
		
	}

}
