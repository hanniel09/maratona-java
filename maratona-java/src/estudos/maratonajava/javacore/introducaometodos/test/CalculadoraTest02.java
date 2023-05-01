package estudos.maratonajava.javacore.introducaometodos.test;

import estudos.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.multiplicaDoisNumeros(20, 30);
        calculadora.multiplicaDoisNumeros(10, 2);
    }
}
