public class Construtores {
    private int numero;
    private double saldo;
    private double limite;

    public Construtores(int numero, double saldo, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    public Construtores() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    public void imprime(){
        System.out.println("NUMERO: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Limite: " + this.limite);
    }
}
