package estudos.maratonajava.javacore.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try ( FileWriter fw = new FileWriter(file, true)){
            fw.write("Hanniel is a best developer in the world \n the best backend developer\n");
            fw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
