package estudos.maratonajava.javacore.exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();

    }
    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try{
            boolean isNewFile = file.createNewFile();
            System.out.println("Arquivo criado " + isNewFile);
        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
