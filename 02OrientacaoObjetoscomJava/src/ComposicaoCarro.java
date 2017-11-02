public class ComposicaoCarro {

    private HerancaVeiculo veiculo01= new HerancaVeiculo();

    public ComposicaoCarro(HerancaVeiculo veiculo01) {
        this.veiculo01 = veiculo01;
    }

    public ComposicaoCarro() {
    }

    public HerancaVeiculo getVeiculo01() {
        return veiculo01;
    }

    public void setVeiculo01(HerancaVeiculo veiculo01) {
        this.veiculo01 = veiculo01;
    }
}
