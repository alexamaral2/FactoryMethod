package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompraDigitalTest {

    @Test
    void deveProcessarCompraDigital() {
        ICompra compra = CompraFactory.obterCompra("Digital");
        assertEquals("Compra de produto digital efetivada", compra.processar());
    }

    @Test
    void deveCancelarCompraDigital() {
        ICompra compra = CompraFactory.obterCompra("Digital");
        assertEquals("Compra de produto digital cancelada", compra.cancelar());
    }
}