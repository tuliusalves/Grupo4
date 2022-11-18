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
				
				biblioteca.adicionarLivro();
			} else if (opcao == 2) {
				System.out.println("Imprimindo livros");
				biblioteca.listarLivros(livros);
			} else if(opcao==3) {
				titulo= (JOptionPane.showInputDialog("Digite o titulo do livro que quer remover:"));
				biblioteca.removerLivro(titulo);
			} else if(opcao ==4) {
				int indice=(Integer.parseInt(JOptionPane.showInputDialog("Qual o Id do livro que "
						+ "quer alterar")));
				biblioteca.alterarLivros(indice);
			}else if(opcao==5) {
				biblioteca.buscarLivroTituloAutor();
			}
			// System.out.println("O que deseja fazer agora? ");
			opcao = (Integer.parseInt(JOptionPane
					.showInputDialog(" Oque deseja fazer agora?" + "\n 0-finalizar operação 1-Adicionar livro "
							+ "\n 2-Imprimir livros 3-Remover livros \n 4-Alterar livro 5-Buscar livro(autor/titulo)")));
		} while (opcao != 0 || opcao>3);

	}

}
