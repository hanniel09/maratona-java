package estudos.maratonajava.javacore.string.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Hanniel"; // String constant pool
        String nome2 = "Hanniel";
        nome = nome.concat(" Vieira");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Hanniel");
        System.out.println(nome2 == nome3.intern());

    }
}
