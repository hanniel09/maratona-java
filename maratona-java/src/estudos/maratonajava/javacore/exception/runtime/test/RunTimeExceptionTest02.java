package estudos.maratonajava.javacore.exception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(4, 2);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println("Código finalizado");
    }

    public static int divisao(int a, int b) {
        if (a == 0 || b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não é possivel fazer divisão por 0");
        }
        return a / b;
    }
}
