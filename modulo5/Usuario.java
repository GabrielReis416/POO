import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa {

    private int idade;
    private List<Emprestimo> historicoEmprestimos;

    public Usuario(String nome, int idade) {
        super(nome);
        this.idade = idade;
        this.historicoEmprestimos = new ArrayList<>();
    }

    public int getIdade() {
        return idade;
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        historicoEmprestimos.add(emprestimo);
    }

    public Emprestimo[] getHistoricoEmprestimos() {
        return historicoEmprestimos.toArray(new Emprestimo[0]);
    }
}
