package estudos.maratonajava.javacore.string.test;

public class StringBufferTest01 {
    public static void main(String[] args) {
        String nome = "Hanniel Vieira";
        nome.concat(" Alves");
        nome = nome.substring(0, 3);
        System.out.println(nome);
        StringBuffer sb = new StringBuffer("Hanniel Vieira");
        sb.append(" Alves").append(" Silva");
        //sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
