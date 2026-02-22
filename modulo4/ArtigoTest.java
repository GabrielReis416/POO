import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArtigoTest {

    @Test
    void deveCriarArtigoPublicadoCorretamente() {

        Autor autor = new Autor("Jessica", "Brasileira", true);

        Artigo artigo = new Artigo(
                "Entendendo Compiladores",
                autor,
                "Tecnologia",
                true
        );

        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertEquals("Tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
        assertEquals(autor, artigo.getAutor());
    }

    @Test
    void devePublicarArtigo() {

        Autor autor = new Autor("Jessica", "Brasileira", true);

        Artigo artigo = new Artigo(
                "Compiladores",
                autor,
                "Tecnologia",
                false
        );

        artigo.publicar();

        assertTrue(artigo.isPublicado());
    }
}