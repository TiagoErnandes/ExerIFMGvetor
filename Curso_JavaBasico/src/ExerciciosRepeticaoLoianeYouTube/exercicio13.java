package ExerciciosRepeticaoLoianeYouTube;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double i=0;
		System.out.println("Digite o primeiro numero");
		double n1 = scan.nextDouble();
		System.out.println("Digite o segundo numero: ");
		double n2 = scan.nextDouble();
		i=n1;
		 for(int c =1;c<n2;c++) {
			 
			 i *= n1;
			 System.out.println(i);
		 }
		 System.out.println("O valor é "+i);
	}

}
