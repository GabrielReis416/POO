package TestUnitarios;
import java.util.Date;

public class EmprestimoTest {

    public static void main(String[] args) {

        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        Livro livro = new Livro(
                "Java Basics",
                new Autor("Alan Turing", "Inglês"),
                "Tecnologia",
                true
        );

        Usuario usuario = new Usuario("Gabriel", 21);

        Emprestimo emprestimo = new Emprestimo(
                dataRetirada,
                dataDevolucao,
                livro,
                usuario
        );

        System.out.println("=== TESTE EMPRÉSTIMO ===");

        System.out.println("Usuário: " + emprestimo.getUsuario().getNome());
        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
        System.out.println("Data Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data Devolução: " + emprestimo.getDataDevolucao());
        System.out.println("Livro disponível após empréstimo? " + livro.isDisponivel());
    }
}