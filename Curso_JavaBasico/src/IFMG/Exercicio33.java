package IFMG;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int a =0, b=0, cont=0,restoDiv=0,soma=0;
		System.out.println("Digite o valor de A");
		a = scan.nextInt();
		System.out.println("Digite o valor de B");
		b = scan.nextInt();
		
		for (int i =b; i<=a ;i+=b) {
			
			cont++;
			soma =i;
			
		}
		restoDiv = a-soma;
		System.out.println("O quociente: "+cont);
		System.out.println("O resto da divisão: "+restoDiv);
	}

}
