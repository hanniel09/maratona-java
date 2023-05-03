package estudos.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;
    private double media = 0;

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
        for (double salario : salarios) {
            media += salario;
        }
            media /= salarios.length;
        System.out.println("\n Media salarial " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}