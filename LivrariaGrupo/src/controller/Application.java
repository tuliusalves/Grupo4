package controller;

import javax.swing.JOptionPane;

import model.Biblioteca;
import model.Livros;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Biblioteca biblioteca = new Biblioteca();
		Livros livros = new Livros();
		int opcao = 0;
		biblioteca.setNome(JOptionPane.showInputDialog("Digite o nome da biblioteca"));
		String titulo;
		do {
			if (opcao == 1) {
				titulo = JOptionPane.showInputDialog("Digite o título do livro:");
				String autor = JOptionPane.showInputDialog("Digite o autor do titulo");
				biblioteca.adicionarLivro(autor, titulo);
			} else if (opcao == 2) {
				System.out.println("Imprimindo livros");
				biblioteca.listarLivros(livros);
			} else if(opcao==3) {
				int id= (Integer.parseInt(JOptionPane.showInputDialog("Digite o id do livro que quer remover:")));
				biblioteca.removerLivro(id);
			}
			// System.out.println("O que deseja fazer agora? ");
			opcao = (Integer.parseInt(JOptionPane
					.showInputDialog(" Oque deseja fazer agora?" + "\n1-Adicionar 2-Imprimir livros"
							+ " 3-Remover livros 0-finalizar operação")));
		} while (opcao != 0 || opcao>3);

	}

}
