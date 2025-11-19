public class SistemaRelatorios {
    public static void main(String[] args) {
        RelatorioFactory fabricaDiaria = new RelatorioDiarioFactory();
        fabricaDiaria.processarRelatorio();

        RelatorioFactory fabricaSemanal = new RelatorioSemanalFactory();
        fabricaSemanal.processarRelatorio();
    }
}