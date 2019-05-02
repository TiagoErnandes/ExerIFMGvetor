package ExerciciosRepeticaoLoianeYouTube;

import java.util.Scanner;

public class exercicio25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean fim =true;
		double preco =0;
		String totVendas="";
		double totV =0;
		int i =1;
		double dinheiro=0;
		
	do {	
		do {
			System.out.println("Digite o preço do produto");
			preco = scan.nextDouble();
			if(preco==0) {
				fim=false;
				System.out.println("Digite o valor pago pelo cliente");
				dinheiro=scan.nextDouble();
				
			}else {
				
				totVendas += ("Produto "+i+++": R$ "+preco+"\n");
				totV+=preco;
			}
		}while(fim);
		
		System.out.println(totVendas);
		System.out.println("Total:    R$"+totV);
		System.out.println("Dinheiro: R$"+dinheiro);
		System.out.println("Troco:    R$"+ (totV-dinheiro));
		
		
	}while(true);
		}
		

	}


