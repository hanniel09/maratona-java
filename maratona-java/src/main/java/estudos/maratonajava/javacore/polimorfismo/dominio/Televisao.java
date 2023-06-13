package estudos.maratonajava.javacore.polimorfismo.dominio;

public class Televisao extends Produto{
    public static final double IMPOSTO_PORCENTO= 0.21;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando o imposto da televisão");
        return this.valor * IMPOSTO_PORCENTO;
    }
}
