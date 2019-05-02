package ExerciciosRepeticaoLoianeYouTube;

import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a quantidade de aluno: ");
		int aluno = scan.nextInt();
	    int totJovem =0;
	    int totAdulto =0;
	    int totIdoso = 0;
	    int idade;
	    boolean valido = false;
	    
		   for(int i=0;i<aluno;i++) {
			   System.out.println("Digite a idade do aluno "+i);
			   idade = scan.nextInt();
			   if(idade>0 && idade <=25) {
				   valido = true;
				   totJovem++;
			   }else if(idade>26 && idade<=60) {
				   valido = true;
				   totAdulto++;
			   }else if(idade>60){
				   valido = true;
				   totIdoso++;
			   }else if(valido) {
				 System.out.println("Idade invalida");
			 }
		   }
		   if (totJovem>totAdulto && totJovem>totIdoso) {
			   System.out.println("A Turma é Jovem!");
		   }else if (totAdulto>totJovem && totJovem > totIdoso) {
			   System.out.println("A Turma e Adulta!");
		   }else {
			   System.out.println("A turma e Idosa!");
		   }
		   System.out.println("");
		   System.out.println("Total de Jovens: "+totJovem);
		   System.out.println("Total de Adultos: "+totAdulto);
		   System.out.println("Total de Idosos: "+totIdoso);

	}

}
