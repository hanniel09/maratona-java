package estudos.maratonajava.javacore.polimorfismo.servico;

import estudos.maratonajava.javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em Memoria");
    }
}
