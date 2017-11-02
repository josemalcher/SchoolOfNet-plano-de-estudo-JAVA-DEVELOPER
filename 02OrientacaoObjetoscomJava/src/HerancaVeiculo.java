public class HerancaVeiculo {
    private String cor;
    private Double velocidadeMaxima;

    public HerancaVeiculo(String cor, Double velocidadeMaxima) {
        this.cor = cor;
        this.velocidadeMaxima = velocidadeMaxima;
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
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(Double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
