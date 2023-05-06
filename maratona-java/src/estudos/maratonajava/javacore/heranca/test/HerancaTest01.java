package estudos.maratonajava.javacore.heranca.test;

import estudos.maratonajava.javacore.heranca.dominio.Endereco;
import estudos.maratonajava.javacore.heranca.dominio.Funcionario;
import estudos.maratonajava.javacore.heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("01234-380");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Pedro");
        pessoa.setCpf("123.456.789-01");
        pessoa.setEndereco(endereco);
        //pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Oda Nobunaga");
        funcionario.setCpf("1111111");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
 
        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
