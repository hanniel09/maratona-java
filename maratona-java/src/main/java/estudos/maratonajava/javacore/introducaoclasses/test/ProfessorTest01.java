package estudos.maratonajava.javacore.introducaoclasses.test;

import estudos.maratonajava.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.name = "Ryan";
        professor.age = 27;
        professor.sex = 'M';

        System.out.println("Nome: " + professor.name);
        System.out.println("Age: " +professor.age);
        System.out.println("Sex: " + professor.sex);
    }
}
