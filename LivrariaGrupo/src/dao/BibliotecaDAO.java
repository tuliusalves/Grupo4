package dao;

import model.Livros;

public interface BibliotecaDAO {
	public void adicionarLivro();
	public void removerLivro(String titulo);
	public void listarLivros(Livros livro);
	public void alterarLivros(int indice);
	public void buscarLivroTituloAutor();
}
