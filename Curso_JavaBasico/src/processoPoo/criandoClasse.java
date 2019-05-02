package processoPoo;

import java.util.Scanner;

public class criandoClasse {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Caneta n1 = new Caneta();
		n1.cor="Azul";
		n1.modelo= "BIC";
		n1.ponta = 1.5;
		n1.tampada = false;
		
		
		System.out.println("Classe Caneta");
		System.out.println();
		n1.status();
		n1.tampa();
		

	}

}
