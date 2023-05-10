package estudos.maratonajava.javacore.interfaces.dominio;

public interface DataLoader {

    public void load();
    public default void checkPermission(){
        System.out.println("Fazendo a checagem de permissões");
    }
}
