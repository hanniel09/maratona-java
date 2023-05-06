package estudos.maratonajava.javacore.modificadorfinal.test;

import estudos.maratonajava.javacore.modificadorfinal.dominio.Carro;
import estudos.maratonajava.javacore.modificadorfinal.dominio.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
    }
}
