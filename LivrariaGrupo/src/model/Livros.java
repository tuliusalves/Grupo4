package model;

public class Livros {
	private static int sequence=1;
	private int idLivro;
	private String titulo;
	private String autor;

	public Livros() {
	}

	public Livros(int idLivro, String titulo, String autor) {
		
		this.idLivro++;
		this.titulo = titulo;
		this.autor = autor;
	}
	
	

	public int getIdLivro() {
		idLivro=sequence++;
		return idLivro;
	}


	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	

	@Override
	public String toString() {
		return "[ID:"+idLivro+" Titulo=" + titulo + ", autor=" + autor + "]";
	}
}
