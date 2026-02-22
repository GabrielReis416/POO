public class EstrategiaPublicacaoLivro implements EstrategiaPublicacao {

    @Override
    public void publicar(PublicavelInterface publicavel) {
        System.out.println("Publicando livro com registro em editora...");
        publicavel.publicar();
    }
}