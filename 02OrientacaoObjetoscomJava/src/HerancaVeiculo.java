public class HerancaVeiculo {
    private String cor;
    private Double VelocidadeMaxima;

    public HerancaVeiculo(String cor, Double velocidadeMaxima) {
        this.cor = cor;
        VelocidadeMaxima = velocidadeMaxima;
    }

    public HerancaVeiculo() {
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getVelocidadeMaxima() {
        return VelocidadeMaxima;
    }

    public void setVelocidadeMaxima(Double velocidadeMaxima) {
        VelocidadeMaxima = velocidadeMaxima;
    }
}
