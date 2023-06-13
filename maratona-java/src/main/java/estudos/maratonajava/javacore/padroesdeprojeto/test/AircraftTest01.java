package estudos.maratonajava.javacore.padroesdeprojeto.test;

import estudos.maratonajava.javacore.padroesdeprojeto.dominio.Aircraft;
import estudos.maratonajava.javacore.padroesdeprojeto.dominio.AircraftSingletonEager;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");

    }

     static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getInstance());
        Aircraft aircraft = new Aircraft("787-900");
        System.out.println(aircraft.bookSeat(seat));
    }
}
