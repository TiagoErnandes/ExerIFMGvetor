package ExerciciosRepeticaoLoianeYouTube;

import java.util.Scanner;

public class exercicio11 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        Scanner scan = new Scanner(System.in);
	        int soma=0;
	        System.out.println("Digite o primeiro numero");
	        int n1 = scan.nextInt();
	        System.out.println("Digite o segundo numero: ");
	        int n2 = scan.nextInt();
	        
	        if(n1<n2) {
	            for(;n1<n2;n1++) {	
	        	System.out.println(n1);
	        	soma+=n1;
	        	}}else{
	        		 for(;n2<n1;n2++) {	
	        	        	System.out.println(n2);
	        	        	soma+=n2;
	        		 }
	        	}System.out.println("A soma ="+soma);
	        }
		}





