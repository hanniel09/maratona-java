package estudos.maratonajava.javacore.io.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created " + isCreated);
            System.out.println("path " + file.getPath());
            System.out.println("path absolute " + file.getAbsolutePath());
            System.out.println("is directory " + file.isDirectory());
            System.out.println("is file " + file.isFile());
            System.out.println("is Hidden " + file.isHidden());
            System.out.println("Last modified  " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean exists = file.exists();
            if(exists){
                System.out.println("Deleted " + file.delete());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
