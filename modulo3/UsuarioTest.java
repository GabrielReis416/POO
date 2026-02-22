import java.util.Date;

public class UsuarioTest {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("Gabriel", 21);

        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Básico", autor, "Tecnologia", true);

        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        Emprestimo emprestimo = new Emprestimo(
                dataRetirada,
                dataDevolucao,
                livro,
                usuario
        );

        System.out.println("=== TESTE USUÁRIO ===");

        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());

        System.out.println("\n--- Histórico de Empréstimos ---");
        for (Emprestimo e : usuario.getHistoricoEmprestimos()) {
            System.out.println("Livro: " + e.getLivro().getTitulo());
            System.out.println("Data Retirada: " + e.getDataRetirada());
            System.out.println("Data Devolução: " + e.getDataDevolucao());
            System.out.println("-----------------------------");
        }
    }
}