import java.util.Date;

public class Emprestimo {

    private Date dataRetirada;
    private Date dataDevolucao;
    private Livro livro;
    private Usuario usuario;

    public Emprestimo(Date dataRetirada, Date dataDevolucao, Livro livro, Usuario usuario) {

        if (!livro.isDisponivel()) {
            throw new IllegalStateException("O livro não está disponível para empréstimo.");
        }

        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;
        this.livro = livro;
        this.usuario = usuario;

        livro.emprestar();
        usuario.adicionarEmprestimo(this);
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void finalizarEmprestimo() {
        livro.devolver();
    }
}