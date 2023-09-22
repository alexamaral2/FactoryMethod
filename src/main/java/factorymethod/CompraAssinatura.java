package factorymethod;

public class CompraAssinatura implements ICompra {

    public String processar() {
        return "Assinatura mensal efetivada";
    }

    public String cancelar() {
        return "Assinatura mensal cancelada";
    }
}