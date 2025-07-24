package modulo2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Jessica Felix", "Brasileira");
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia");

        Usuario usuario = new Usuario("Gabriel Reis", 22);

        
        Date data = new Date();
        Emprestimo emprestimo1 = new Emprestimo(data, data, livro, usuario);

        
        System.out.println("\nLivro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo1.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo1.getDataDevolucao());
    }
}