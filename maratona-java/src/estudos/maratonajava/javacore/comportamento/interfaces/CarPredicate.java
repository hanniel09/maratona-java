package estudos.maratonajava.javacore.comportamento.interfaces;

import estudos.maratonajava.javacore.comportamento.dominio.Car;

public interface CarPredicate {
    boolean test(Car car);
}
