public class Livro implements PublicavelInterface {

    private String titulo;
    private Autor autor;
    private String genero;
    private boolean publicado;

    public Livro(String titulo, Autor autor, String genero, boolean publicado) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.publicado = publicado;

        autor.adicionarObra(this);
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isPublicado() {
        return publicado;
    }

    @Override
    public void publicar() {
        this.publicado = true;
        System.out.println("Livro publicado com sucesso!");
    }
}