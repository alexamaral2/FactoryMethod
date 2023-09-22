package factorymethod;

public class CompraDigital implements ICompra {
    public String processar() {
        return "Compra de produto digital efetivada";
    }

    public String cancelar() {
        return "Compra de produto digital cancelada";
    }
}