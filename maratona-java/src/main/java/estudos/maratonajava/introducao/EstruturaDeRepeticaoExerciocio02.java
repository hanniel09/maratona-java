package estudos.maratonajava.introducao;

public class EstruturaDeRepeticaoExerciocio02 {
    public static void main(String[] args) {
        int carValue = 10000;
        for (int parcela = 1; parcela <= carValue; parcela++){
            double valorParcela = carValue / parcela;
            if(valorParcela < 1000){
                break;
            }
            System.out.println("Parcela " + parcela + " R$" + valorParcela);
        }

    }
}
