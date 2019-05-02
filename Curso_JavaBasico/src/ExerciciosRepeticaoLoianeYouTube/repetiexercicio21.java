package ExerciciosRepeticaoLoianeYouTube;

import java.util.Scanner;

public class repetiexercicio21 {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int turma =0;
	int alunos =0;
	int soma =0;
	int media =0;
	boolean valido = false;
	 System.out.println("Digite a quantidade de turma :");
	 turma = scan.nextInt();
	 
	  for (int i =1;i<turma;i++) {
		  valido=false;
		  do {
			  System.out.println("Digite a quantida de aluno da turma "+i);
			  alunos=scan.nextInt();
			  if(alunos>0 && alunos<=40) {
				  valido= true;
			  }else {
				  System.out.println("Valor invalido, não pode ser maior que 40 e menor que 0 ");
			  }
			  
			  
			  
		  }while(!valido);
		  soma+=alunos;
	  }
	  media = soma/turma;
	  System.out.println("A média da turma e igual á "+media );
	}

}
