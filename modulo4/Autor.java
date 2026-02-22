import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {

    private String nacionalidade;
    private boolean autorTradicional; // NOVO CAMPO
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

    public void adicionarObra(Livro livro) {
        obrasPublicadas.add(livro);
    }

    public Livro[] getObrasPublicadas() {
        return obrasPublicadas.toArray(new Livro[0]);
    }
}