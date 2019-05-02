package IFMG;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean bool = false;
		long m = 0, s = 0, a, b, x;
		System.out.println("Digite um numero");
		a = scan.nextLong();
		b = a;
		while (a >= 10) {
			m = a % 10;
			s = m + (s * 10);
			a = a / 10;
		}
		x = (s * 10) + a;
		System.out.println(x);
		System.out.println(b);
		if (x == b) {
			bool = true;
		}
		if (bool == true) {
			System.out.println("Palimedro");
		} else {
			System.out.println("Nao e Palimedro");
		}

	}

}
