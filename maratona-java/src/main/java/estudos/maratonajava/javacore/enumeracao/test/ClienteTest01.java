package estudos.maratonajava.javacore.enumeracao.test;

import estudos.maratonajava.javacore.enumeracao.dominio.Cliente;
import estudos.maratonajava.javacore.enumeracao.dominio.TipoCliente;
import estudos.maratonajava.javacore.enumeracao.dominio.TipoPagamento;
public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Tsubaza", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente02 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA,TipoPagamento.DEBITO);
        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNome("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
