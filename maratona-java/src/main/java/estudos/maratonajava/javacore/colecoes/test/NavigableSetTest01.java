package estudos.maratonajava.javacore.colecoes.test;

import estudos.maratonajava.javacore.colecoes.dominio.Manga;
import estudos.maratonajava.javacore.colecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;


class SmartPhoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartPhoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "Berserk", 19.9, 5));
        mangas.add(new Manga(4L,"Hellsing Ultimate",9.5, 0));
        mangas.add(new Manga(1L,"Pokemon",3.2, 0));
        mangas.add(new Manga(3L,"Attack on titan",11.20, 2));
        mangas.add(new Manga(2L,"Dragon ball Z",2.99, 0));
        mangas.add(new Manga(10L,"Jujutsu no Kaisen",2.95, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga yuyu = new Manga(6L, "Yuyu Hakusho", 3.2, 5);

        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println("----------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
    }
}
