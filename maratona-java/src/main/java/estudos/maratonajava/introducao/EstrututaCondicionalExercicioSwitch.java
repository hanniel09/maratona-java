package estudos.maratonajava.introducao;

public class EstrututaCondicionalExercicioSwitch {
    public static void main(String[] args) {
        byte day = 5;

        switch (day) {
            case 1:
                System.out.println("Domingo, Fim de semana");
                break;
            case 2:
                System.out.println("Segunda, dia útil");
                break;
            case 3:
                System.out.println("Terça, dia útil");
                break;
            case 4:
                System.out.println("Quarta, dia útil");
                break;
            case 5:
                System.out.println("Quinta, dia útil");
                break;
            case 6:
                System.out.println("Sexta, dia útil");
                break;
            case 7:
                System.out.println("Sabado, Fim de semana");
                break;
            default:
                System.out.println("Opção invalida");
        }

    }
}
