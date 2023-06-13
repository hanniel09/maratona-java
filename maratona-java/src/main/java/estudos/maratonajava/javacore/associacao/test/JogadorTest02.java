package estudos.maratonajava.javacore.associacao.test;

import estudos.maratonajava.javacore.associacao.dominio.Jogador;
import estudos.maratonajava.javacore.associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);

        jogador1.imprime();


    }
}
