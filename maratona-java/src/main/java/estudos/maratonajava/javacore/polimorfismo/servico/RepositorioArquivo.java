package estudos.maratonajava.javacore.polimorfismo.servico;

import estudos.maratonajava.javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em arquivo");
    }
}
