package CursoJavaLoiane;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		
		lampada.setCor("Amarelo");
		lampada.setLigado(true);
		lampada.setVoltagem(12);
		System.out.println(lampada.toString());
		lampada.Ligar();
		System.out.println(lampada.toString());
		lampada.Ligar();
		System.out.println(lampada.toString());

	}

}
