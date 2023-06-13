package estudos.maratonajava.javacore.introducaometodos.test;

import estudos.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        System.out.println("\nFinalizando CalculadoraTeste soma e subtração");


        calculadora.multiplicaDoisNumeros(20, 30);
        calculadora.multiplicaDoisNumeros(10, 2);
        System.out.println("\nFinalizando CalculadoraTeste multiplicação");

        int result = (int) calculadora.divideDoisNumeros(20,2);
        System.out.println(result);
        System.out.println("\nFinalizando CalculadoraTeste divisão");

    }
}
