package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraFactoryTest {

    @Test
    void deveRetornarExcecaoParaCompraInexistente() {
        try {
            ICompra compra = CompraFactory.obterCompra("EAD");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Compra não existe", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCompraInvalida() {
        try {
            ICompra compra = CompraFactory.obterCompra("Ferias");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Compra inválida", e.getMessage());
        }
    }
}