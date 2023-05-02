package estudos.maratonajava.javacore.introducaometodos.test;

import estudos.maratonajava.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Hanniel";
        funcionario.idade = 18;
        funcionario.salarios = new double[]{1200, 900, 3000};

        funcionario.imprime();
    }
}
