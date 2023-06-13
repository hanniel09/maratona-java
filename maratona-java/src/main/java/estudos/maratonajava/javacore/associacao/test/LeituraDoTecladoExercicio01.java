package estudos.maratonajava.javacore.associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoExercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O Grande software de previsão do futuro");
        System.out.println("Digite sua pergunta e eu digitarei Sim ou Não");
        String pergunta = input.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        } else{
            System.out.println("NÃO");
        }
    }
}
