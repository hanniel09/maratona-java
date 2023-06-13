package estudos.maratonajava.introducao;

public class EstruturaCondicional {
    public static void main(String[] args) {
        int age = 15;
        boolean isAuthorizedBuyBooze = age > 18;
        if(isAuthorizedBuyBooze) {
            System.out.println("He can buy booze");
        } else {
            System.out.println("He can't buy booze");
        }
        if(isAuthorizedBuyBooze) {
            System.out.println("He can buy booze");
        }
        if(!isAuthorizedBuyBooze){
            System.out.println("He can't buy booze");
        }
    }
}
