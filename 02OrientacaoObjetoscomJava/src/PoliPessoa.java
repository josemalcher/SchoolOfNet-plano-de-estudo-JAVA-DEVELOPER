public class PoliPessoa {
    private String nome;
    private Integer idade;
    private String veiculo;

    public PoliPessoa(String nome, Integer idade, String veiculo) {
        this.nome = nome;
        this.idade = idade;
        this.veiculo = veiculo;
    }

    public PoliPessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public PoliPessoa() {
    }

    public String getNome() {
        return this.nome;
    }

    public String getNome(String apelido) { //  <<<<-------------------
        return "Nome é " + this.nome + " Apelido " + apelido;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public void metodoSobreescrito(){
        System.out.println("TESTE Método sobreescrito - PAI");
    }


}
