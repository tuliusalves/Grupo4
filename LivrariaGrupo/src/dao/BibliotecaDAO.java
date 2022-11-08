package dao;

import model.Livros;

public interface BibliotecaDAO {
	public void adicionarLivro(String autor, String titulo);
	public void removerLivro(int idLivro);
	public void listarLivros(Livros livro);
}
