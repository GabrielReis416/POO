import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AutorTest {

    @Test
    void deveCriarAutorComTipoCorreto() {

        Autor autor = new Autor("Jessica", "Brasileira", true);

        assertEquals("Jessica", autor.getNome());
        assertEquals("Brasileira", autor.getNacionalidade());
        assertTrue(autor.isAutorTradicional());
    }
}