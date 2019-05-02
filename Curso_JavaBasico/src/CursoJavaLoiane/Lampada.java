package CursoJavaLoiane;

public class Lampada {
	private String tipo;
	private String cor;
	private boolean ligado;
	private double valor;
	private int voltagem;
	
	
	


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public boolean isLigado() {
		return ligado;
	}


	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public int getVoltagem() {
		return voltagem;
	}


	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	public void Ligar() {
		if (this.ligado == false)
		this.ligado= true;
		else 
	   this.ligado=false;
     }

	@Override
	public String toString() {
		return "Lampada [tipo=" + tipo + ", cor=" + cor + ", ligado=" + ligado + ", valor=" + valor + ", voltagem="
				+ voltagem + "]";
	}
	
	
}
