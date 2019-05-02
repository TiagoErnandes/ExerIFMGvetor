package ExerciciosRepeticaoLoianeYouTube;

import java.util.Scanner;

public class exercicio26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int num =0;
		int fat=1;
		int cinco =0;
		System.out.println("Digite o numero para calcuar fatorial :");
		num = scan.nextInt();
		cinco = num-5;
		System.out.print(num+"! = ");
		  for (int i =num;i>cinco;i--) {
			  fat*=i;
			System.out.print(i+" . ");  
		  }
		  System.out.println("= "+fat);

	}

}
