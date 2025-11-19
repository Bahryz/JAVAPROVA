public class ModeloAgressivo implements PerfilInvestidorStrategy {
    @Override
    public void calcularRisco() {
        System.out.println("Cálculo Agressivo: Foco em alta rentabilidade e volatilidade aceita.");
    }
}