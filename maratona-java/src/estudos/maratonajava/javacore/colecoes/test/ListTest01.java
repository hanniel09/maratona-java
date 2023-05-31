package estudos.maratonajava.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Hanniel");
        nomes.add("Developer");
        nomes2.add("Vieira");
        nomes2.add("Java");

        // System.out.println(nomes.remove("developer java"));

        nomes.addAll(nomes2);
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("-----------");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        System.out.println(numeros);

    }
}
