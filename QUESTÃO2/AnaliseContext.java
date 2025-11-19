public class AnaliseContext {
    private PerfilInvestidorStrategy estrategia;

    public void setEstrategia(PerfilInvestidorStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void executarAnalise() {
        if (estrategia != null) {
            estrategia.calcularRisco();
        } else {
            System.out.println("Nenhuma estratégia de análise definida.");
        }
    }
}