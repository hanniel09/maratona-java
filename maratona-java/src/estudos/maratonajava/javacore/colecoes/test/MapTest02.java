package estudos.maratonajava.javacore.colecoes.test;

import estudos.maratonajava.javacore.colecoes.dominio.Consumidor;
import estudos.maratonajava.javacore.colecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Hanniel");
        Consumidor consumidor2 = new Consumidor("Pedro");


        Manga manga1 = new Manga(5L, "Berserk", 19.9);
        Manga manga2 = new Manga(4L,"Hellsing Ultimate",9.5);
        Manga manga3 = new Manga(1L,"Pokemon",3.2);
        Manga manga4 = new Manga(3L,"Attack on titan",11.20);
        Manga manga5 = new Manga(2L,"Dragon ball Z",2.99);

        Map<Consumidor, Manga> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, manga1);
        consumidorMangaMap.put(consumidor2, manga4);
        for(Map.Entry<Consumidor, Manga> entry : consumidorMangaMap.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " +entry.getValue().getNome());
        }
    }
}
