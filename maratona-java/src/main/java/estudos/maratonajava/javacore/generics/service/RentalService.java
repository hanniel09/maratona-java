package estudos.maratonajava.javacore.generics.service;

import estudos.maratonajava.javacore.generics.dominio.Carro;

import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;
    public RentalService(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel(){
        System.out.println("Buscando objeto disponiveis....");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto: " + t);
        System.out.println("objetos disponiveis para alugar: ");
        System.out.println(objetosDisponiveis);
        return t;
    }
    public void retornarObjetoAlugado(T t){
        System.out.println("Devolvendo objeto " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponíveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }
}
