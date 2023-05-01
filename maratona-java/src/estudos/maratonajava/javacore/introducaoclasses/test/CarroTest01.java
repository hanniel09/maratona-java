package estudos.maratonajava.javacore.introducaoclasses.test;

import estudos.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro car01 = new Carro();
        Carro car02 = new Carro();

        car01.nome = "Senna";
        car01.modelo = "McLaren";
        car01.ano = 2023;
        car02.nome = "F8 Spider";
        car02.modelo = "Ferrari";
        car02.ano = 2022;

        System.out.println("\nCarro 1");
        System.out.println(car01.nome);
        System.out.println(car01.modelo);
        System.out.println(car01.ano);

        System.out.println("\nCarro 2");
        System.out.println(car02.nome);
        System.out.println(car02.modelo);
        System.out.println(car02.ano);
    }
}
