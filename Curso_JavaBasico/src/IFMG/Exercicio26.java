package IFMG;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int a=0,b=400000,tempo=0;
		
		while (a <= b) {
			a += 30;
			b -= 40;
			tempo++;
		}
		System.out.println("O tempo gasto: "+tempo);
		System.out.println("A locomotiva A deve pecorre metros "+a);
		System.out.println("A locomotiva B deve pecorre metros "+(400000-b));
	}

}
