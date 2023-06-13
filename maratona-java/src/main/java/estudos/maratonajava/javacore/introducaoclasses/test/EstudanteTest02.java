package estudos.maratonajava.javacore.introducaoclasses.test;

import estudos.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.sex);
    }
}
