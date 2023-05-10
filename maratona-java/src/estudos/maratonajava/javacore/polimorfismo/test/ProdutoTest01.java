package estudos.maratonajava.javacore.polimorfismo.test;

import estudos.maratonajava.javacore.polimorfismo.dominio.Computador;
import estudos.maratonajava.javacore.polimorfismo.dominio.Tomate;
import estudos.maratonajava.javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Nuc10i7", 11000);
        Tomate tomate = new Tomate("Tomate Italiano", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);

    }
}
