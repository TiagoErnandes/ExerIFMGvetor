package ExerciciosRepeticaoLoianeYouTube;

import java.util.Scanner;

public class exercicios03 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	boolean valida = false;
	String nome;
	int idade ;
	double salario ;
	String sexo;
	String civil;
	
	do {
	
     System.out.println("Digite seu nome ?");
     nome = scan.next();
     
     if(nome.length()>3){
    	 
    	 valida=true;  
     }else {
    	 System.out.println("numero de caractere invalido");
    	   	 
     }} while (!valida);
     
	do {
     System.out.println("Idade entre 0 e 150 ?");
     idade = scan.nextInt();
     if (idade >=00 && idade <= 150) {
    	 valida= true;
     } else {
    	 System.out.println("Idade invalida");
    	 valida=false;
     }}while (!valida);
	
	
	do {
     System.out.println("Sálario maior que 0 ?");
 	salario = scan.nextDouble();
 	   if(salario>0) {
 		   valida=true;
 	   }else {
 		   System.out.println("Valor invalido , não pode ser menor que 0");
 		   valida=false;
 	   } }while (!valida);
	do {
     System.out.println("Sexo F ou M ?");
     sexo = scan.next();
        if (sexo.equalsIgnoreCase("f")||sexo.equalsIgnoreCase("m")) {
          valida = true;	
        }else {
        	System.out.println("Sexo invalido");
        	valida=false;
        } }while (!valida);
	do {
     System.out.println("Estado civil 's' 'c' 'v' 'd' ?");
      civil = scan.next();
      if (civil.equalsIgnoreCase("s") || civil.equalsIgnoreCase("c") || civil.equalsIgnoreCase("v") || civil.equalsIgnoreCase("d")) {
    	  valida = true;
      }else {
    	  System.out.println("Estado civil invalido");
    	  valida=false;
      }
	} while (!valida);
	System.out.println(nome);
	System.out.println(idade);
	System.out.println(sexo);
	System.out.println(salario);
	System.out.println(civil);
	
	
}
}
