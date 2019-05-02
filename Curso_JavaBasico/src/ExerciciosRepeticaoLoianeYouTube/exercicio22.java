package ExerciciosRepeticaoLoianeYouTube;

import java.util.Scanner;

public class exercicio22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double qtdCd=0;
		double cd =0;
		double soma =0;
		double media =0;
		
		
		
		System.out.println("Digite a quantidade de quantidade de CD");
		qtdCd= scan.nextDouble();
		  for(int i =1;i<=qtdCd;i++) {
			  System.out.println("Digite o valor do CD "+i);
			  cd=scan.nextDouble();
			  soma +=cd; 
			  media = soma/qtdCd;
		  }
       
        System.out.println("A media de cade CD e igual :"+media);
        
        
	}

}
