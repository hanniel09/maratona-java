package estudos.maratonajava.javacore.exception.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liverado pelo SO");
        }
        return null;
    }
    private static String abreConexao02() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        } finally {
            System.out.println("Fechando recurso liverado pelo SO");
        }
    }
}
