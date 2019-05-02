package IFMG;

import java.util.Scanner;

public class Exercicios22 {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int soma=0 , num=0,totNum=0;
	double media=0;
	
	do {
		System.out.println("Digite o numero para soma ");
		num = scan.nextInt();
		if(num == -1) {
			continue;
		}
		soma += num;
		totNum++;
	}while(num != -1);
	
	media = (double)soma/totNum;
	System.out.println("A soma dos valores digitados foi "+soma);
	System.out.println("A media digitada é :"+media);
	}

}
