package IFMG;

import java.util.Scanner;

public class Revisao19Ifmg {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		int bin, separador, potencia = 0,deciHexa=0;
		int decimal = 0,octal=0;
		String hexa = "",hexaF="";
		System.out.println("Digite o valor em Binario");
		bin = scan.nextInt();
		while (bin > 0) {
			separador = bin % 10;
			bin = bin / 10;
			if (separador == 1) {
				decimal += Math.pow(2, potencia);
			}
			potencia++;
		}
		
		System.out.println("Valor em Decimal: "+decimal);
		deciHexa=decimal;
		
		potencia=0;
		while (decimal>0) {
			separador = decimal % 8;
			octal = octal + separador *(int)Math.pow(10, potencia);
			decimal = decimal /8 ;
			potencia++;
		
		}
		System.out.println("Valor em Octal :"+octal);
		
		potencia=0;
		decimal=deciHexa;
		while (decimal>0) {
			separador = decimal % 16;
			if (separador<=9) {
				hexa = hexa + separador;
			}else {
				switch (separador) {
				case 10:
					hexa = "A"+ hexa ;
					break;
				case 11:
					hexa = "B"+ hexa ;
					break;
				case 12:
					hexa = "C"+ hexa ;
					break;
				case 13:
					hexa = "D"+ hexa ;
					break;
				case 14:
					hexa = "E"+ hexa ;
					break;
				case 15:
					hexa = "F"+ hexa ;
					break;	

				default:
					break;
				}
			}
			
			decimal = decimal /16 ;
			potencia++;
		
		}
		//String hexaFinal = new StringBuilder(hexa).reverse().toString();
		//System.out.println("Valor em Hexa :"+hexaFinal);
		for (int i = hexa.length()-1; i >= 0; i--) {
		  hexaF   += hexa.charAt(i);
		  System.out.println(hexa.charAt(i));
		}
		System.out.println(hexaF);
	
		
	}
}
