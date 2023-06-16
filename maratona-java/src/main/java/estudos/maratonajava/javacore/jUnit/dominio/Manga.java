package estudos.maratonajava.javacore.jUnit.dominio;

import java.util.Objects;

public record Manga(String name, int episodes) {
    public Manga{
        Objects.requireNonNull(name);
    }
}
