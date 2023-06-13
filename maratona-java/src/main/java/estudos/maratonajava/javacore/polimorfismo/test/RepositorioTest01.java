package estudos.maratonajava.javacore.polimorfismo.test;


import estudos.maratonajava.javacore.polimorfismo.repositorio.Repositorio;
import estudos.maratonajava.javacore.polimorfismo.servico.RepositorioArquivo;
import estudos.maratonajava.javacore.polimorfismo.servico.RepositorioBancoDeDados;
import estudos.maratonajava.javacore.polimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Gohan");
        list.add("Kuririn");
        System.out.println(list);
    }
}
