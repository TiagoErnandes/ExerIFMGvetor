package ExerciciosRepeticaoLoianeYouTube;

import java.util.Scanner;

public class exercicio21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int turma = 0;
		int alunos = 0;
		int media = 0;
		int soma =0;
		System.out.println("Digite a quantidade de turma :");
		turma= scan.nextInt();
		
		for (int i =0;i<turma;i++) {
			
			
			System.out.println("Digite a quantidade de aluno da sala "+i);
			alunos = scan.nextInt();
			if(alunos > 0 && alunos<= 40) {
				soma +=alunos;
			}else {
				System.out.println("A quantidade não pode ser maior que 40 é menor que 0");
				break;
			}
		}
		media=soma/turma;
		System.out.println("A media de aluno por turma é igual :"+media);
	}

}
