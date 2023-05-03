package estudos.maratonajava.javacore.introducaometodos.test;

import estudos.maratonajava.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Hanniel");
        funcionario.setIdade(18);
        funcionario.setSalarios(new double[]{1200, 900, 3000});
        funcionario.imprime();
        System.out.println("Média" + funcionario.getMedia());
    }
}
