package estudos.maratonajava.javacore.introducaometodos.test;

import estudos.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        System.out.println("FInalizando CalculadoraTest01");
    }
}
