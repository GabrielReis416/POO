package modulo2;

import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
    private String nacionalidade;
    private List<Livro> obrasPublicadas;

    public Autor(String nome, String nacionalidade) {
        super(nome);
        this.nacionalidade = nacionalidade;
        this.obrasPublicadas = new ArrayList<>();
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void adicionarObra(Livro livro) {
        obrasPublicadas.add(livro);
    }

    public Livro[] getObrasPublicadas() {
        return obrasPublicadas.toArray(new Livro[0]);
    }

    public Livro[] getObrasPublicadasPorGenero(String genero) {
        return obrasPublicadas.stream()
                .filter(l -> l.getGenero().equalsIgnoreCase(genero))
                .toArray(Livro[]::new);
    }
}