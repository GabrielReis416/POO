public class LivroTest {

    public static void main(String[] args) {

        Autor autor = new Autor("Jess", "Brasileira");

        Livro livro1 = new Livro("Java Basico", autor, "Tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "Tecnologia", false);

        System.out.println("=== TESTE LIVRO ===");

        System.out.println("Livro 1:");
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor().getNome());
        System.out.println("Disponível: " + livro1.isDisponivel());

        System.out.println("\nLivro 2:");
        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor().getNome());
        System.out.println("Disponível: " + livro2.isDisponivel());
    }
}