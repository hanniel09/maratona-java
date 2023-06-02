package estudos.maratonajava.javacore.generics.test;

import estudos.maratonajava.javacore.generics.dominio.Barco;
import estudos.maratonajava.javacore.generics.dominio.Carro;
import estudos.maratonajava.javacore.generics.service.BarcoRentavelSevice;
import estudos.maratonajava.javacore.generics.service.CarroRentavelSevice;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelSevice barcoRentavelSevice = new BarcoRentavelSevice();
        Barco barco = barcoRentavelSevice.buscarBarcoDisponivel();
        System.out.println("Usando carro por um mês...");
        barcoRentavelSevice.retornarBarcoAlugado(barco);
    }
}
