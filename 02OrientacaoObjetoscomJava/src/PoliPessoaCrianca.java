public class PoliPessoaCrianca extends PoliPessoa {

    public PoliPessoaCrianca(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public void metodoSobreescrito() {
        //super.metodoSobreescrito();
        System.out.println("Método dentro do FILHO");
    }
}
