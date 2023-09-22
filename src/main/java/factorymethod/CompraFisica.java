package factorymethod;

public class CompraFisica implements ICompra {
    public String processar() {
        return "Compra de produto físico efetivada";
    }

    public String cancelar() {
        return "Compra de produto físico cancelada";
    }
}