package estudos.maratonajava.javacore.io.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try ( FileWriter fw = new FileWriter(file, true);
              BufferedWriter br = new BufferedWriter(fw)){
            br.write("Hanniel is the best developer in the world");
            br.newLine();
            br.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
