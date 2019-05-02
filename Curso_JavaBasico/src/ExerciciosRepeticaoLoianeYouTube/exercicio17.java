package ExerciciosRepeticaoLoianeYouTube;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite um numero para o fatorial: ");
		int fat = scan.nextInt();
		int fato =1;
	       for (int i=fat ;i>0;i--) {
        	
        	fato *= i;
        	 System.out.println(i);
        }
	       System.out.println(fato);
        }
		

	}


