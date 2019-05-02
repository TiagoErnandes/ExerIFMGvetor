import java.util.Scanner;

public class va12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		  int var=27;
		  int combustivel;
		  double mediaConsumo;
		  
		  System.out.println("Digite o combustivel :");
		  combustivel = scan.nextInt();
		  mediaConsumo =(double) var/ combustivel;
		  
		  System.out.println("A media do consumo é :"+mediaConsumo);

	}

}
