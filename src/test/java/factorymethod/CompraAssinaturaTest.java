package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompraAssinaturaTest {

    @Test
    void deveProcessarCompraAssinatura() {
        ICompra compra = CompraFactory.obterCompra("Assinatura");
        assertEquals("Assinatura mensal efetivada", compra.processar());
    }

    @Test
    void deveCancelarCompraAssinatura() {
        ICompra compra = CompraFactory.obterCompra("Assinatura");
        assertEquals("Assinatura mensal cancelada", compra.cancelar());
    }
}