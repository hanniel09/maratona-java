package estudos.maratonajava.javacore.polimorfismo.servico;

import estudos.maratonajava.javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em Banco de dados");
    }
}
