package ExerciciosRepeticaoLoianeYouTube;

import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num= scan.nextInt();
	boolean primo = true;
	
	
	for (int i=2;i<num;i++)
		
	  if (num%i==0) {
		  System.out.println("O numero "+num+" não é Primo");
		  primo=false;
	  }
	if(primo) {
		System.out.println("O numero e Primo");
	}
	}

}
