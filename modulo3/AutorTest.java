public class AutorTest {

    public static void main(String[] args) {

        Autor autor = new Autor("Jess", "Brasileira");

        Livro livro1 = new Livro("Java Básico", autor, "Tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "Tecnologia", true);
        Livro livro3 = new Livro("Romance Moderno", autor, "Romance", true);

        System.out.println("=== TESTE AUTOR ===");

        System.out.println("Autor: " + autor.getNome());
        System.out.println("Nacionalidade: " + autor.getNacionalidade());

        System.out.println("\n--- Todas as Obras ---");
        for (Livro livro : autor.getObrasPublicadas()) {
            System.out.println(livro.getTitulo() + " - " + livro.getGenero());
        }

        System.out.println("\n--- Obras de Tecnologia ---");
        for (Livro livro : autor.getObrasPublicadasPorGenero("Tecnologia")) {
            System.out.println(livro.getTitulo());
        }
    }
}