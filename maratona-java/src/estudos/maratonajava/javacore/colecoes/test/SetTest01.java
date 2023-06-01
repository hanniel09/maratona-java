package estudos.maratonajava.javacore.colecoes.test;

import estudos.maratonajava.javacore.colecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(5L, "Berserk", 19.9, 5));
        mangas.add(new Manga(4L,"Hellsing Ultimate",9.5, 0));
        mangas.add(new Manga(1L,"Pokemon",3.2, 0));
        mangas.add(new Manga(3L,"Attack on titan",11.20, 2));
        mangas.add(new Manga(2L,"Dragon ball Z",2.99, 0));


        for(Manga manga : mangas) {
            System.out.println(manga);
        }
    }

}
