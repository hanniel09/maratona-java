package estudos.maratonajava.javacore.colecoes.test;

import estudos.maratonajava.javacore.colecoes.dominio.Smartophone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartophone s1 = new Smartophone("1ABC1", "iphone");
        Smartophone s2 = new Smartophone("1ABC1", "iphone");
        System.out.println(s1.equals(s2));
    }
}
