package estudos.maratonajava.javacore.interfaces.dominio;

public interface DataLoader {
    void load();
    default void checkPermission(){
        System.out.println("Fazendo a checagem de permissões");
    }
}
