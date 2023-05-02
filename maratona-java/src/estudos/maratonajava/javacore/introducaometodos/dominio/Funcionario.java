package estudos.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println("-------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.println(salario + " ");
        }
        imprimeMediaSalario();

    }

    public void imprimeMediaSalario() {
        if (salarios == null) {
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
            media /= salarios.length;
        System.out.println("\n Media salarial " + media);
    }
}
