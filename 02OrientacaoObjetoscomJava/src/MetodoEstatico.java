public class MetodoEstatico {

    private static Integer valorFixo = 10;
    private Integer valorVariavel;

    public static Integer getValorFixo() {
        return valorFixo;
    }

    public static void setValorFixo(Integer valorFixo) {
        MetodoEstatico.valorFixo = valorFixo; // <<<<<---------------
    }

    public Integer getValorVariavel() {
        return valorVariavel;
    }

    public void setValorVariavel(Integer valorVariavel) {
        this.valorVariavel = valorVariavel; // <<<<<---------------
    }

    //método statico

    public void imprimeValores(){
        System.out.println("Valor Fixo = " + valorFixo);
        System.out.println("Valor Variável = "+ valorVariavel);
    }
    public static void imprimeMetodoEstatico(){
        System.out.println("Dentro do método statico");
        System.out.println("Valor Fixo = " + valorFixo);
        //System.out.println("Valor Variável = "+ valorVariavel); // não compila
    }
}
