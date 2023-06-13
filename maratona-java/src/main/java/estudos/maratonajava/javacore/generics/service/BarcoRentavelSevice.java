package estudos.maratonajava.javacore.generics.service;

import estudos.maratonajava.javacore.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelSevice {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando Barcos disponiveis....");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando barco: " + barco);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcosDisponiveis);
        return barco;
    }
    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo Barco " + barco);
        barcosDisponiveis.add(barco);
        System.out.println("Barcos disponíveis para alugar: ");
        System.out.println(barcosDisponiveis);
    }
}
