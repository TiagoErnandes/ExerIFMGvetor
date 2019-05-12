package CursoJavaLoiane;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.setMarca("Fusca");
		
		van.setModelo("Van");
		van.setNumPassageiros(4);
		van.setCapCombustivel(60);
		van.setConsumoCombustivel(20);
		
		van.toString();
		System.out.println();

	}

}
