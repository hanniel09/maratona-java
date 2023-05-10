package estudos.maratonajava.javacore.polimorfismo.dominio;

public class Computador extends Produto{
    public static final double IMPOSTO_PORCENTO= 0.21;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o imposto do computador");
        return this.valor * IMPOSTO_PORCENTO;
    }


}
