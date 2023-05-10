package estudos.maratonajava.javacore.interfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    public void load();
    public default void checkPermission(){
        System.out.println("Fazendo a checagem de permissões");
    }
    public static void retrievMaxDataSize(){
        System.out.println();
    }
}
