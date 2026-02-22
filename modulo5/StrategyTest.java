public class StrategyTest {

    public static void main(String[] args) {

        Autor autor = new Autor("Jessica", "Brasileira", true);

        Livro livro = new Livro("Java Moderno", autor, "Tecnologia", false);
        Artigo artigo = new Artigo("Padrões de Projeto", autor, "Tecnologia", false);

        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        autor.publicar(livro);

        System.out.println("Livro publicado? " + livro.isPublicado());

        System.out.println("----------------------");

        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        autor.publicar(artigo);

        System.out.println("Artigo publicado? " + artigo.isPublicado());
    }
}