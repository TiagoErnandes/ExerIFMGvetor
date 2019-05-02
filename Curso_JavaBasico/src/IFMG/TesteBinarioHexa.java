package IFMG;

import java.util.Scanner;

public class TesteBinarioHexa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int num,cont=0,aux,soma=0,teste,decimal=0;
		String hexa="";
		
		System.out.println("Digite o numero binario ");
		num = scan.nextInt();
		
		while(num > 0) {
			soma=0;
			cont=0;
			while (cont < 4) {
				aux = num % 10;
				if (aux == 1) {
					if (cont ==0) {
						soma+=1;
					}else if (cont == 1) {
						soma+=2;
					}else if (cont == 2) {
						soma+=4;
					}else if (cont == 3) {
						soma+=8;
					}
					
				}
				
				num = num/10;
				cont++;
			}
		
			if (soma<10) {
				hexa += soma+"";
			}else {
				if (soma == 10) {
					hexa= "A"+hexa;
				}else if (soma == 11) {
					hexa= "B"+hexa;
				}else if (soma == 12) {
					hexa= "C"+hexa;
				}else if (soma == 13) {
					hexa= "D"+hexa;
				}else if (soma == 14) {
					hexa= "E"+hexa;
				}else if (soma == 15) {
					hexa= "F"+hexa;
				}
			}
			
		}
		
		System.out.println(hexa);
	

	}

}
