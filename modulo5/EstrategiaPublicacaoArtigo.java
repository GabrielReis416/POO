public class EstrategiaPublicacaoArtigo implements EstrategiaPublicacao {

    @Override
    public void publicar(PublicavelInterface publicavel) {
        System.out.println("Publicando artigo em revista científica...");
        publicavel.publicar();
    }
}