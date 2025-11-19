public class ModeloConservador implements PerfilInvestidorStrategy {
    @Override
    public void calcularRisco() {
        System.out.println("Cálculo Conservador: Foco em preservação de capital. Peso alto em renda fixa.");
    }
}