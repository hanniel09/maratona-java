package estudos.maratonajava.javacore.jUnit.service;

import estudos.maratonajava.javacore.jUnit.dominio.Person;

import java.util.Objects;

public class PersonService {
    public boolean isAdult(Person person){
        Objects.requireNonNull(person, "Person cat'b be null");
        return person.getAge() >= 18;
    }
}
