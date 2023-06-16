package estudos.maratonajava.javacore.jUnit.test;

import estudos.maratonajava.javacore.jUnit.dominio.Person;
import estudos.maratonajava.javacore.jUnit.service.PersonService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class PersonServiceTest01 {
    public static void main(String[] args) {
        Person person = new Person(15);
        PersonService personService = new PersonService();
        log.info("Is Adult? '{}'", personService.isAdult(person));
    }
}
