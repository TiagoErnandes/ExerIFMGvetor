package ExerciciosRepeticaoLoianeYouTube;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num ;
		int numero=Integer.MIN_VALUE;
		
		for (int i = 0;i<5;i++) {
			System.out.println("Digite um numero :");
			num = scan.nextInt();
			  if(num>numero) {
				  numero=num;
			  }
		}
		System.out.println("O maior numero é:"+numero);

	}

}
