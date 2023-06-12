package estudos.maratonajava.javacore.padroesdeprojeto.test;

import estudos.maratonajava.javacore.padroesdeprojeto.dominio.Aircraft;
import estudos.maratonajava.javacore.padroesdeprojeto.dominio.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
//        AircraftTest01.bookSeat("1A");
    }

    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getInstance());
        AircraftSingletonEager aircraftSingletonEager = AircraftSingletonEager.getInstance();
        System.out.println(aircraftSingletonEager.bookSeat(seat));
    }
}
