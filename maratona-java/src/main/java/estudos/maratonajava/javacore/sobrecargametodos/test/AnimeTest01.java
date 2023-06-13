package estudos.maratonajava.javacore.sobrecargametodos.test;

import estudos.maratonajava.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        //anime.init("One Piece", "TV", 1060);
        anime.init("One Piece", "TV", 1060, "ficção de aventura");
        anime.imprime();
    }
}
