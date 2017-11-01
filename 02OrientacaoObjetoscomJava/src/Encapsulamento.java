public class Encapsulamento {

    private String nome;
    private String endereco;
    private String cpf;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void mudaCPF(String cpf) {
        if (this.idade <= 60) {
            validaCPF(cpf);
        }
        this.cpf = cpf;
    }

    private void validaCPF(String cpf) {
        // série de regras aqui, falha caso não seja válido
    }
    /*
    O controle sobre o CPF está centralizado: ninguém consegue acessá-lo sem passar por aí,
    a classe "Cliente"(por exemplo) é a única responsável pelos seus próprios atributos!
     */

}
