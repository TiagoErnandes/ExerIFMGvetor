package IFMG;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner (System.in);
	      String cidade,msgMaiorIndice="",msgMenorIndice="";
	      int qtdVeiculos,numCidades,indiceAcidente,maiorIndice=Integer.MIN_VALUE,menorIndice=Integer.MAX_VALUE,
	    		  totQtdaAcidente=0,totQtdVeiculos=0,totQtdaAcidente200=0,totmenos200=0;
	      double razao,media,mediaMenor200;
	      
	      for (int i =0;i<3;i++){
	    	  
	          System.out.println("Digite o nome da cidade "); 
	          cidade = scan.next();
	          System.out.println("Digite a quantidade de veiculos");
	          qtdVeiculos = scan.nextInt();
	          totQtdVeiculos+=qtdVeiculos;  
	          System.out.println("Digite a quantidade de acidentes na cidade de "+cidade);
	          indiceAcidente = scan.nextInt();
	          totQtdaAcidente+=indiceAcidente;
	          if(qtdVeiculos<200) {
	        	  totQtdaAcidente200=indiceAcidente;
	        	  totmenos200++;
	          }
	          if (indiceAcidente > maiorIndice){
	              msgMaiorIndice = "A cidade "+cidade+" possuir o maior indice com "+indiceAcidente+" de acidentes: ";
	              maiorIndice= indiceAcidente;
	              
	          }
	          
	          if(indiceAcidente < menorIndice){
	              msgMenorIndice = "A cidade "+cidade+" possuir o menor indice com "+indiceAcidente+" de acidentes: ";
	              menorIndice = indiceAcidente;
	          }
	         
	          
	      }
	        System.out.println(msgMaiorIndice);
	        System.out.println(msgMenorIndice);
	        razao =(double) totQtdVeiculos/totQtdaAcidente;
	        media = totQtdVeiculos/3;
	        mediaMenor200 = totQtdaAcidente200/totmenos200;
	        
	        System.out.println("A razao "+razao);
	        System.out.println("A media de carros é "+media);
	        System.out.println("A media de acidentes de transito em cidades abaixo de 200 veiculos "+mediaMenor200);
	        

	}

}
