public class HerancaVeiculoCarro extends HerancaVeiculo{
    private Integer machas;

    public HerancaVeiculoCarro(String cor, Double velocidadeMaxima, Integer machas) {
        super(cor, velocidadeMaxima);
        this.machas = machas;
    }

    public HerancaVeiculoCarro() {
        super();
    }

    public HerancaVeiculoCarro(Integer machas) {
        this.machas = machas;
    }

    public Integer getMachas() {
        return machas;
    }

    public void setMachas(Integer machas) {
        this.machas = machas;
    }
}
