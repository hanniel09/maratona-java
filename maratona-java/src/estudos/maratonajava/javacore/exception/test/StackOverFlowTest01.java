package estudos.maratonajava.javacore.exception.test;

public class StackOverFlowTest01 {
    //atenção!!! esse codigo retorna um erro.
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }
}
