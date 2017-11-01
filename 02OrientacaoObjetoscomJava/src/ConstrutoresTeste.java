public class ConstrutoresTeste {
    public static void main(String[] args) {

        Construtores c01 = new Construtores();

        Construtores c02 = new Construtores(123,100.88,123.456);

        c01.imprime();
        c02.imprime();

       /*
        NUMERO: 0
        Saldo: 0.0
        Limite: 0.0
        NUMERO: 123
        Saldo: 100.88
        Limite: 123.456
       */

    }
}
