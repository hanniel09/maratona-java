package estudos.maratonajava.javacore.introducaoclasses.test;

import estudos.maratonajava.javacore.introducaoclasses.dominio.Estudante;

import javax.swing.*;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Luffy";
        estudante.age = 21;
        estudante.sex = 'M';

        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.sex);

    }
}
