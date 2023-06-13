package estudos.maratonajava.javacore.classesinternas.test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";
    class Inner {
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }
    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        inner.printOuterClassAttribute();
    }
}
