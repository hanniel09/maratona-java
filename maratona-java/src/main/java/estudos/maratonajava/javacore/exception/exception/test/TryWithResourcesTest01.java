package estudos.maratonajava.javacore.exception.exception.test;

import estudos.maratonajava.javacore.exception.exception.dominio.Leitor01;
import estudos.maratonajava.javacore.exception.exception.dominio.Leitor02;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }
    public static void lerArquivo(){
        try(Leitor02 leitor02 = new Leitor02();
            Leitor01 leitor01 = new Leitor01();){

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
