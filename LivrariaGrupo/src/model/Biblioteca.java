package model;

import java.util.ArrayList;

import dao.BibliotecaDAO;

public class Biblioteca implements BibliotecaDAO {
	private String nome;
	ArrayList <Livros> livrosLista= new ArrayList<>();
	
	
	public Biblioteca() {}
	public Biblioteca(String nome, ArrayList<Livros> livrosLista) {
		super();
		this.nome = nome;
		this.livrosLista = livrosLista;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Livros> getLivrosLista() {
		return livrosLista;
	}
	public void setLivrosLista(ArrayList<Livros> livrosLista) {
		this.livrosLista = livrosLista;
	}
	
	
	public void adicionarLivro(String autor, String titulo ) {
		Livros livros = new Livros();
		livros.getIdLivro();
		livros.setTitulo(titulo);
		livros.setAutor(autor);
		livrosLista.add(livros);
	}
	public void removerLivro(int idLivro) {
		livrosLista.remove(--idLivro);
	}
	public void listarLivros(Livros livros) {
		for(Livros x: livrosLista) {
			System.out.println("Nome da biblioteca: "+ getNome()+" " +x.toString());
		}
	}
}
