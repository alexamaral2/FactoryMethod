package factorymethod;
public class CompraFactory {

    public static ICompra obterCompra(String Compra) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("factorymethod.Compra" + Compra);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Compra não existe");
        }
        if (!(objeto instanceof ICompra)) {
            throw new IllegalArgumentException("Compra inválida");
        }
        return (ICompra) objeto;
    }
}
