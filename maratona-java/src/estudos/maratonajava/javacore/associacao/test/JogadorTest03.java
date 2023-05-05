package estudos.maratonajava.javacore.associacao.test;

import estudos.maratonajava.javacore.associacao.dominio.Jogador;
import estudos.maratonajava.javacore.associacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
         Jogador jogador = new Jogador("Cafú");
         Jogador jogador02= new Jogador("Pelé");
         Time time = new Time("Brasil");
         Jogador[] jogadores = {jogador, jogador02};

         jogador.setTime(time);
         jogador02.setTime(time);


         time.setJogadores(jogadores);

        System.out.println("---Jogador---");
        jogador.imprime();
        jogador02.imprime();
        System.out.println("---Time---");
        time.imprime();

    }
}
