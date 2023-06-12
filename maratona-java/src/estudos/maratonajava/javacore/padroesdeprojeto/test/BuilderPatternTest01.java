package estudos.maratonajava.javacore.padroesdeprojeto.test;

import estudos.maratonajava.javacore.padroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = Person.PersonBuilder
                .builder()
                .firstName("Hanniel")
                .lastName("Vieira")
                .userName("Backend Develepor")
                .email("Hanniel@QueroUmEmprego.com")
                .build();
        System.out.println(build);

    }
}
