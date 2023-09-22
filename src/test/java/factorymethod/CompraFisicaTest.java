package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompraFisicaTest {

    @Test
    void deveProcessarCompraFisica() {
        ICompra compra = CompraFactory.obterCompra("Fisica");
        assertEquals("Compra de produto físico efetivada", compra.processar());
    }

    @Test
    void deveCancelarCompraFisica() {
        ICompra compra = CompraFactory.obterCompra("Fisica");
        assertEquals("Compra de produto físico cancelada", compra.cancelar());
    }
}