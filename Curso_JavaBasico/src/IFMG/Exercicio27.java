package IFMG;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int consumidor=0,qtdConsumo=0,tipo=0,contMedia1and2=0;
		boolean validador =false;
		double custo=0,totCusto=0,tot1and2=0,media1and2=0;
		String relatorio = "";
		
		
		while (!validador) {
			System.out.println("Digite o numero do consumidor ");
			consumidor =  scan.nextInt();
			if (consumidor == 0) {
				validador = true;
				break;
			}else {
				System.out.println("Digite quantidade de consumo ");
				qtdConsumo = scan.nextInt();
				System.out.println("Tipo (código) do consumidor.\r\n" + 
						"1 – residencial, preço em reais por kWh = 0,3\r\n" + 
						"2 – comercial, preço em reais por kWh = 0,5\r\n" + 
						"3 – industrial, preço em reais por kWh = 0,7");	
				tipo = scan.nextInt();
				switch(tipo) {
				case 1:
					custo =(double) qtdConsumo * 0.3;
					contMedia1and2++;
				case 2:
					custo =(double) qtdConsumo * 0.5;
					contMedia1and2++;
				case 3:
					custo =(double) qtdConsumo * 0.7;	
				}
				if(tipo == 1 || tipo == 2) {
					tot1and2+=custo;
				}
				
				totCusto +=custo;
				relatorio += "O consumidor com o registro "+consumidor+" tem o custo de energia"
						+ " de R$ "+custo+" .\n";
			}
			
		}
		media1and2 = tot1and2/contMedia1and2;
		System.out.println(relatorio);
		System.out.println("O total de custo de todos os clientes: "+totCusto);
		System.out.println("A media de custo de 1 e 2 é "+media1and2);
		

	}

}
