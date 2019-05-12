package CursoJavaLoiane;

public class Livro {
	private String nome;
	private String assunto;
	private int totPaginas;
	private String autor;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", assunto=" + assunto + ", totPaginas=" + totPaginas + ", autor=" + autor + "]";
	}
	
	
}
