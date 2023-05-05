package estudos.maratonajava.javacore.associacao.test;

import estudos.maratonajava.javacore.associacao.dominio.Escola;
import estudos.maratonajava.javacore.associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor01 = new Professor("Jiraya Sensei");
        Professor professor02 = new Professor("Kakashi Sensei");
        Professor[] professores = {professor01, professor02};
        Escola escola = new Escola("Konoha", professores);
        escola.imprime();
    }
}
