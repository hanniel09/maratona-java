package estudos.maratonajava.javacore.string.test;

public class StringPerfomaceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para a String " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(3_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para a StringBuilder " + (fim - inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(3_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para a StringBuffer " + (fim - inicio) + " ms");
    }
    private static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
    private static void concatStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

}