package estudos.maratonajava.javacore.exception.exception.test;

import estudos.maratonajava.javacore.exception.exception.dominio.Funcionario;
import estudos.maratonajava.javacore.exception.exception.dominio.LoginInvalidoException;
import estudos.maratonajava.javacore.exception.exception.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.Salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
