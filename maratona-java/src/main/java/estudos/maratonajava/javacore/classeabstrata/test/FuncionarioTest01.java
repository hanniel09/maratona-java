package estudos.maratonajava.javacore.classeabstrata.test;

import estudos.maratonajava.javacore.classeabstrata.dominio.Desenvolvedor;
import estudos.maratonajava.javacore.classeabstrata.dominio.Funcionario;
import estudos.maratonajava.javacore.classeabstrata.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 4000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
    }
}
