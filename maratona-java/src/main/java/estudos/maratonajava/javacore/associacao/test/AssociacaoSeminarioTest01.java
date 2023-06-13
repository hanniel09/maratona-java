package estudos.maratonajava.javacore.associacao.test;

import estudos.maratonajava.javacore.associacao.dominio.Aluno;
import estudos.maratonajava.javacore.associacao.dominio.Local;
import estudos.maratonajava.javacore.associacao.dominio.Professor;
import estudos.maratonajava.javacore.associacao.dominio.Seminario;

public class AssociacaoSeminarioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno01 = new Aluno("Luffy", 21);
        Professor professor01 = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosSeminario = {aluno01};

        Seminario seminario = new Seminario("Onde achar o One Piece", alunosSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor01.setSeminarios(seminariosDisponiveis);

        professor01.imprime();

    }
}
