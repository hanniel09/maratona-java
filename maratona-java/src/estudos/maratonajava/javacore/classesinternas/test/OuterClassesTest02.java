package estudos.maratonajava.javacore.classesinternas.test;


public class OuterClassesTest02 {
    private String name = "Midoriya";

    void print() {
       final String lastName = "Izuku";
        class LocalClass {
            public void printLocal() {
                System.out.println(name);
            }
        }
       new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }
}
