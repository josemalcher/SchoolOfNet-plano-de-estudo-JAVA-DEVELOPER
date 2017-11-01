public class MetodoEstaticoTeste {
    public static void main(String[] args) {

        MetodoEstatico metodo01 = new MetodoEstatico();
        metodo01.setValorVariavel(55);
        metodo01.imprimeValores();

        System.out.println("---------------");
        MetodoEstatico.setValorFixo(222); // alterando valor fixo
        System.out.println(MetodoEstatico.getValorFixo());
        MetodoEstatico.imprimeMetodoEstatico();

        System.out.println("---------------");
        metodo01.imprimeValores(); // <<<<------

    }
}
