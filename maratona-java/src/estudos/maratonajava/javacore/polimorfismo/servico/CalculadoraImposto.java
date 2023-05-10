package estudos.maratonajava.javacore.polimorfismo.servico;

import estudos.maratonajava.javacore.polimorfismo.dominio.Computador;
import estudos.maratonajava.javacore.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor " + computador.getValor());
        System.out.println("Imposto computador " + imposto);
    }
    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatório de imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate " + tomate.getNome());
        System.out.println("Valor " + tomate.getValor());
        System.out.println("Imposto tomate " + imposto);
    }
}
