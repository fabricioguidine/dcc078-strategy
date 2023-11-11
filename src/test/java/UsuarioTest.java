import org.example.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

    Usuario usuario;
    String nomeExtensao;

    @BeforeEach
    void setUp() {
        usuario = new Usuario();
        nomeExtensao = "extensao";
    }

    @Test
    void deveSalvarHTML() {
        assertEquals("Extensão *.HTML salva!", usuario.salvarHTML(nomeExtensao));
    }

    @Test
    void deveSalvarPDF() {
        assertEquals("Extensão *.PDF salva!", usuario.salvarPDF(nomeExtensao));
    }

    @Test
    void deveSalvarTXT() {
        assertEquals("Extensão *.TXT salva!", usuario.salvarTXT(nomeExtensao));
    }

    @Test
    void deveSalvarXML() {
        assertEquals("Extensão *.XML salva!", usuario.salvarXML(nomeExtensao));
    }
}