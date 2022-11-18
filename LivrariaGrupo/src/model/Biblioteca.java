package model;

import java.util.ArrayList;
import java.util.function.Predicate;

import javax.swing.JOptionPane;

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
	
	@Override
	public void adicionarLivro( ) {
		
		livrosLista.add(addInformacao());
	}
	@Override
	public void removerLivro(String titulo) {
		/*Preciso fazer o uso de um "predicado" para pegar uma condição
		 * específica para assim poder deletar a patir de um elemento específico
		 * de um arrayList.
		 * Após isso poss remover o arraylist a partir do retorno booleando de removeIf  */ 
		Predicate<Livros> condicao= livrosLista -> livrosLista.getTitulo().equals(titulo);
		livrosLista.removeIf(condicao );
		
		
	}
	@Override
	public void alterarLivros(int indice) {
		Livros livro = livrosLista.get(indice);
		String autor=(JOptionPane.showInputDialog("Digite o nome do autor"));
		String titulo=(JOptionPane.showInputDialog("Digite o título do livro"));
		livro.setAutor(autor);
		livro.setTitulo(titulo);
		//livro.setIdLivro(livrosLista.indexOf(livro));
		livrosLista.set(indice, livro);//n tá funcionando
		
	}
	@Override
	public void listarLivros(Livros livros) {
		for(Livros x: livrosLista) {
			System.out.println("Nome da biblioteca: "+ getNome()+" " +x.toString());
		}
	}
	
	@Override
	public void buscarLivroTituloAutor() {
		String titulo =JOptionPane.showInputDialog("Qual o título que desja buscar:");
		String autor = JOptionPane.showInputDialog("Qual o autor que deseja buscar");
		
		for(Livros auxLivros: livrosLista) {
			if(auxLivros.getTitulo().equalsIgnoreCase(titulo) && auxLivros.getAutor().equalsIgnoreCase(autor)) {
				System.out.println("Livro encontrado! "+auxLivros.toString());
				
			}
		}
		
	}
	public Livros addInformacao( ) {
		Livros livro = new Livros();
		String autor=(JOptionPane.showInputDialog("Digite o nome do autor"));
		String titulo=(JOptionPane.showInputDialog("Digite o título do livro"));
		livro.setAutor(autor);
		livro.setTitulo(titulo);
		//livro.setIdLivro(livrosLista.size());
		/*if(livrosLista.size()==1) {
			livro.setIdLivro(livrosLista.size()-1);
		}else if(livrosLista.size()>1) {
			livro.setIdLivro(livrosLista.size());
		}*/
		if(livrosLista.size()>0) {
			livro.setIdLivro(livrosLista.size());
		}else 
		livro.setIdLivro(0);
		
		return livro;
	}
	
}
