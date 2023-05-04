package estudos.maratonajava.javacore.modificadorstatico.test;

import estudos.maratonajava.javacore.modificadorstatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite (180);
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedez", 275);
        Carro c3 = new Carro("Audi", 290);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
