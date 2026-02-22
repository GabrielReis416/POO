import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {

    private String nacionalidade;
    private boolean autorTradicional;
    private EstrategiaPublicacao estrategiaPublicacao;
    private List<Livro> obrasPublicadas;

    public Autor(String nome, String nacionalidade, boolean autorTradicional) {
        super(nome);
        this.nacionalidade = nacionalidade;
        this.autorTradicional = autorTradicional;
        this.obrasPublicadas = new ArrayList<>();
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public boolean isAutorTradicional() {
        return autorTradicional;
    }

    public void setEstrategiaPublicacao(EstrategiaPublicacao estrategia) {
        this.estrategiaPublicacao = estrategia;
    }

    public void publicar(PublicavelInterface publicavel) {
        if (estrategiaPublicacao == null) {
            throw new IllegalStateException("Estratégia de publicação não definida.");
        }
        estrategiaPublicacao.publicar(publicavel);
    }

    public void adicionarObra(Livro livro) {
        obrasPublicadas.add(livro);
    }

    public Livro[] getObrasPublicadas() {
        return obrasPublicadas.toArray(new Livro[0]);
    }
}