package estudos.maratonajava.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        nomes.add("Hanniel");
        nomes.add("Developer Java");

        for (String nome : nomes) {
            System.out.println(nome);
        }
        nomes.add("Vieira");
        System.out.println("-----------");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
