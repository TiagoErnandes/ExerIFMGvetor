import java.util.Scanner;

public class ExercicioVetor32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		int []a = new int [5];
		
		for(int i =0 ; i < a.length;i++) {
		System.out.println("Digite o valor: "+i);
		a[i] = scan.nextInt();
		
		}
		for (int i =0;i < 49;i++) {
			if(i > 9) {
				a[0] ++;
			}
			System.out.println(a[0]+"  x  "+i+" = "+(a[0]*i));
		}
	}

}
