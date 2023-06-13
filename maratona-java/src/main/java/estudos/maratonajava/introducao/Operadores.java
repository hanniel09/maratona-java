package estudos.maratonajava.introducao;

public class Operadores {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        int results = number2 / number1;

        //System.out.println("valor " + results);

        int resto = 21 % 2;
        //System.out.println(resto);

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;
        /*
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezDiferenteVinte);
         */

        int age = 29;
        float salary = 3500F;
        boolean isUnderAgeInTheLaw = age > 30 && salary > 4612;
        boolean isMinorInTheLaw = age < 30 && salary > 3381;
        //System.out.println(isUnderAgeInTheLaw);
        //System.out.println(isMinorInTheLaw);

        double checkingAccount = 200;
        double totalitySavingsAccount = 10000;
        float playstationValue = 5000F;

        boolean isPlaystationPurchasable = checkingAccount > playstationValue || totalitySavingsAccount > playstationValue;

        System.out.println(isPlaystationPurchasable);

        double bonus = 1800;
        bonus += 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

    }
}
