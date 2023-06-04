package estudos.maratonajava.javacore.comportamento.interfaces;

import estudos.maratonajava.javacore.comportamento.dominio.Car;

public interface CarPredicate {
    // anonimas, funções, conciso
    boolean test(Car car);
    //(parametro) -> <expressão>
    //(Car car) -> car.getColor().equals("green");
}
