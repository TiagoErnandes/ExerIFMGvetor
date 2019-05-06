package IFMG;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String sexo ;
		double altura=0,peso =0,somaPesoMulheres=0,maiorAlturaHomens= Integer.MIN_VALUE;
		int idade=0,nPessoas;
		System.out.println("Digite a quantidade de pessoas");
		nPessoas = scan.nextInt();
		for (int i =1; i<nPessoas;i++) {
			System.out.println("Digite o sexo da pessoa "+i+" F- para Feminino "
					+ "é M - para Masculino");
			sexo = scan.next();
			System.out.println("Digite a altura");
			altura = scan.nextDouble();
			System.out.println("Digite a idade ");
			idade = scan.nextInt();
			System.out.println("Digite o peso ");
			peso = scan.nextDouble();
			
			if (sexo.equalsIgnoreCase("f") && idade >30 ) {
				somaPesoMulheres+=peso;
			}
			if(sexo.equalsIgnoreCase("m") ) {
				if (altura > maiorAlturaHomens) {
					maiorAlturaHomens = altura;
				}
			}
		}
		
		System.out.println("A soma dos pesos de mulheres acima de 30 :"+somaPesoMulheres);
		System.out.println("A maior altura dos homens :"+maiorAlturaHomens);

	}

}
