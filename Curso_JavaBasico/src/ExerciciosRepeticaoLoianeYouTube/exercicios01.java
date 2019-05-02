package ExerciciosRepeticaoLoianeYouTube;

import java.util.Scanner;

public class exercicios01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		boolean valida = false;
		
		do {
			System.out.println("Digite o numero de 0 á 10 :");
			int num = scan.nextInt();
		   if (num > 0 && num < 10) {
			   valida=true;  
			   System.out.println("Você Digitou a nota: "+num);
		   }else {
			   System.out.println("Valor invalido, digite novamente");
			   
		   }
		}while(!valida);

	}

}
