package estudos.maratonajava.javacore.string.test;

public class StringBufferTest01 {
    public static void main(String[] args) {
        String nome = "Hanniel Vieira";
        nome.concat(" Alves");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Hanniel Vieira");
        sb.append(" Alves");
        System.out.println(sb);
    }
}
