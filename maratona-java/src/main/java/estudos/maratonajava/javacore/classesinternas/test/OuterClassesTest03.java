package estudos.maratonajava.javacore.classesinternas.test;

public class OuterClassesTest03 {
    private String name = "Hanniel";
    static class Nested {
        private String lastName = "Vieira";
        void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
