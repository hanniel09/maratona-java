package estudos.maratonajava.javacore.generics.test;

import estudos.maratonajava.javacore.generics.dominio.Carro;
import estudos.maratonajava.javacore.generics.service.CarroRentavelSevice;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelSevice carroRentavelSevice = new CarroRentavelSevice();
        Carro carro = carroRentavelSevice.buscarCarroDisponivel();
        System.out.println("Usando carro por um mês...");
        carroRentavelSevice.retornarCarroAlugado(carro);
    }
}
