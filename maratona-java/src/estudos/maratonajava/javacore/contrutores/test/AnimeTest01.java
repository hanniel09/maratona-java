package estudos.maratonajava.javacore.contrutores.test;

import estudos.maratonajava.javacore.contrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece", "TV", 1060, "ficção de aventura");
        anime.imprime();
    }
}
