package ExerciciosRepeticaoLoianeYouTube;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int num =0;
		int totImp=0;
		int totPar=0;
		
for (int i =0;i<10;i++) {
	System.out.println("Digite o numero "+i);
	num = scan.nextInt();
	if(num%2==0) {
		totPar++;
	}else {
		totImp ++;
	}
	
}
System.out.println("O total de Par é : "+totPar);
System.out.println("O total de Impar é : "+totImp);
	}

}
