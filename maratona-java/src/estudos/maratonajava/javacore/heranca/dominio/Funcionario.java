package estudos.maratonajava.javacore.heranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco estático de Funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização Funcionario 01");
    }
    {
        System.out.println("Dentro do bloco de inicialização Funcionario 02");
    }

    public Funcionario(String nome ){
        super(nome);
        System.out.println("Dentro do construtor funcionário");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu: " + this.nome + "recebi o salário de " + this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
