package estudos.maratonajava.javacore.generics.service;

import estudos.maratonajava.javacore.generics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelSevice {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedez")));

    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando carros disponiveis....");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + carro);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(carrosDisponiveis);
        return carro;
    }
    public void retornarCarroAlugado(Carro carro){
        System.out.println("Devolvendo carro " + carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carrosDisponiveis);
    }
}
