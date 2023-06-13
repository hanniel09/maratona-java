package estudos.maratonajava.javacore.modificadorstatico.dominio;

public class Carro {
    private String modelo;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String modelo, double velocidadeMaxima) {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("-------------");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade limete: " + Carro.velocidadeLimite);
    }
   public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
