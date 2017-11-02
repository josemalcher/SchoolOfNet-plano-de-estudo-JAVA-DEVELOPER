public class PoliPessoaTeste {
    public static void main(String[] args) {

        PoliPessoa pessoa = new PoliPessoa("Jose Malcher", 33, "Moto");

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getNome("Avenida "));
        pessoa.metodoSobreescrito();
        System.out.println("-----------------------------------------------------------------");

        PoliPessoaCrianca crianca = new PoliPessoaCrianca("Maria", 05);
        System.out.println(crianca.getNome());
        System.out.println(crianca.getNome("Mariazinha"));
        crianca.metodoSobreescrito();


    }

}
