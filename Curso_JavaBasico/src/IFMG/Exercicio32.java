package IFMG;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int m,totD=0,fat=1,somaImpar=0;
		boolean termina = false;
		
		while(!termina) {
		System.out.println("Digite o valor de M");
		m = scan.nextInt();
		if(m == 0) {
			termina = true;
			break;
			
		}
		
		if(m % 2 ==0) {
			for (int i =1 ; i<=m;i++) {
				if(m % i == 0) {
					totD++;
				}
			}
			System.out.println("O numero "+m+" possui "+totD+" divisores.");
		}else if(m % 2 == 1 && m < 10 ) {
			fat=1;
			for (int i =m;i>1;i--) {
				fat *=i;
			}
			System.out.println("O fatorial do numero "+m+" é : "+fat);
		}else if(m % 2 == 1 && m > 10) {
			for (int i =0 ; i <= m;i++) {
				somaImpar +=i;
			}
			System.out.println("A soma dos valores de "+m+" é :"+somaImpar);
		}	
	}
		System.out.println("FIM");
	}

}
