package estudos.maratonajava.javacore.colecoes.test;

import estudos.maratonajava.javacore.colecoes.dominio.Consumidor;
import estudos.maratonajava.javacore.colecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(5L, "Berserk", 19.9, 5));
        mangas.add(new Manga(4L,"Hellsing Ultimate",9.5, 0));
        mangas.add(new Manga(1L,"Pokemon",3.2, 0));
        mangas.add(new Manga(3L,"Attack on titan",11.20, 2));
        mangas.add(new Manga(2L,"Dragon ball Z",2.99, 0));
        mangas.add(new Manga(10L,"Jujutsu no Kaisen",2.95, 0));

        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }

    }
}
