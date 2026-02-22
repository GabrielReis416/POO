import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Autor autor = new Autor("Jessica Felix", "Brasileira", true);

        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia", false);

        Usuario usuario = new Usuario("Gabriel Reis", 22);

        Date data = new Date();
        Emprestimo emprestimo = new Emprestimo(data, data, livro, usuario);

        Artigo artigo = new Artigo(
                "Entendendo Compiladores",
                autor,
                "Tecnologia",
                false
        );

        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        autor.publicar(livro);

        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        autor.publicar(artigo);

        System.out.println("\n=== SISTEMA ===");
        System.out.println("Autor tradicional? " + autor.isAutorTradicional());
        System.out.println("Livro publicado? " + livro.isPublicado());
        System.out.println("Artigo publicado? " + artigo.isPublicado());
        System.out.println("Livro disponível após empréstimo? " + livro.isPublicado()); 
    }
}