import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Autor autor = new Autor("Jessica Felix", "Brasileira", true);

        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia", true);

        Usuario usuario = new Usuario("Gabriel Reis", 22);

        Date data = new Date();

        Emprestimo emprestimo = new Emprestimo(data, data, livro, usuario);

        Artigo artigo = new Artigo(
                "Entendendo Compiladores",
                autor,
                "Tecnologia",
                true
        );

        System.out.println("=== SISTEMA ===");
        System.out.println("Autor tradicional? " + autor.isAutorTradicional());
        System.out.println("Livro disponível? " + livro.isDisponivel());
        System.out.println("Artigo publicado? " + artigo.isPublicado());
    }
}