package estudos.maratonajava.javacore.generics.test;

import estudos.maratonajava.javacore.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(barcoList);

    }
    private static <T> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }
}


