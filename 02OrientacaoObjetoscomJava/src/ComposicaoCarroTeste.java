public class ComposicaoCarroTeste {
    public static void main(String[] args) {

        ComposicaoCarro carroModelo = new ComposicaoCarro();
        carroModelo.getVeiculo01().setCor("AZUL");
        carroModelo.getVeiculo01().setVelocidadeMaxima(300.00);

        System.out.println("COR " + carroModelo.getVeiculo01().getCor());
        System.out.println("Velocidade Máxima " + carroModelo.getVeiculo01().getVelocidadeMaxima());

    }
}
