package estudos.maratonajava.javacore.polimorfismo.test;

import estudos.maratonajava.javacore.polimorfismo.dominio.Computador;
import estudos.maratonajava.javacore.polimorfismo.dominio.Produto;
import estudos.maratonajava.javacore.polimorfismo.dominio.Tomate;
import estudos.maratonajava.javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/06/2023");
        CalculadoraImposto.calcularImposto(tomate);

        CalculadoraImposto.calcularImposto(produto);

    }
}
