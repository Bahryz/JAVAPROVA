public class AnaliseInvestimentos {
    public static void main(String[] args) {
        AnaliseContext analise = new AnaliseContext();

        analise.setEstrategia(new ModeloConservador());
        analise.executarAnalise();

        analise.setEstrategia(new ModeloAgressivo());
        analise.executarAnalise();

        analise.setEstrategia(new ModeloModerado());
        analise.executarAnalise();
    }
}