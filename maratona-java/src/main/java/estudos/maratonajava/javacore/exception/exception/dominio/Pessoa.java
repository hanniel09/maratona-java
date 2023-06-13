package estudos.maratonajava.javacore.exception.exception.dominio;

import java.io.FileNotFoundException;

public class Pessoa {
    public void Salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando pessoa");
    }
}
