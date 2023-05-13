package estudos.maratonajava.javacore.exception.exception.test;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {

    }
    public static void lerArquivo(){
        try(Reader reader = new BufferedReader(new FileReader("texto.txt"));){

        }catch (IOException e){

        }
    }
    public static void lerArquivo02(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("texto.txt"));
        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
