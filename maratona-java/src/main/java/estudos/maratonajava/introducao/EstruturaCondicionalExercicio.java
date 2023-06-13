package estudos.maratonajava.introducao;

public class EstruturaCondicionalExercicio {
    public static void main(String[] args) {
        double salaryPerYear = 45000;
        double firstFees = 9.70/ 100;
        double secondFees = 37.35/ 100;
        double thirdFees = 49.50/ 100;
        double feesValue;

        if(salaryPerYear <= 34712){
            salaryPerYear = salaryPerYear * firstFees;
        } else if (salaryPerYear >= 34713 && salaryPerYear<= 68507){
            salaryPerYear = salaryPerYear * secondFees;
        }else {
            salaryPerYear = salaryPerYear * thirdFees;
        }
        System.out.println(salaryPerYear);
    }
}
