package IFMG;

public class Exercicio25 {

	public static void main(String[] args) {
		int a,b,ano;
		a=500000;
		b=700000;
		ano=2015;
		
		while (b>a) {
			a += (a*0.3)/100;
			b += (b*0.2)/100;
			ano++;
			System.out.println(ano);
			System.out.println(a+"  ==  "+b);
		}
		System.out.println(ano);
	}

}
