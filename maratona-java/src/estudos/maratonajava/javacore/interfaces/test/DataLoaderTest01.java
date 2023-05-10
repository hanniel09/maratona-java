package estudos.maratonajava.javacore.interfaces.test;

import estudos.maratonajava.javacore.interfaces.dominio.DataLoader;
import estudos.maratonajava.javacore.interfaces.dominio.DatabaseLoader;
import estudos.maratonajava.javacore.interfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();
        DataLoader.retrievMaxDataSize();
        DatabaseLoader.retrievMaxDataSize();
    }
}
