package estudos.maratonajava.javacore.enumeracao.test;

import estudos.maratonajava.javacore.enumeracao.dominio.Cliente;
import estudos.maratonajava.javacore.enumeracao.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Tsubaza", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.CREDITO);
        Cliente cliente02 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA,Cliente.TipoPagamento.DEBITO);
        System.out.println(cliente01);
        System.out.println(cliente02);

    }
}
